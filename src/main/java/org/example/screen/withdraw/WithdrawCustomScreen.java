package org.example.screen.withdraw;

import org.example.model.WithdrawModel;
import org.example.screen.contract.ScreenContract;

import java.time.LocalDateTime;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.components.MessageComponent.*;
import static org.example.util.NumberUtil.isGreaterThan1000;
import static org.example.util.NumberUtil.isMultiplyOf10;
import static org.example.util.StringUtil.isValidAmountOfMoney;
import static org.example.util.SystemUtil.print;
import static org.example.util.SystemUtil.printEmptyLine;

public class WithdrawCustomScreen extends ScreenContract {
    @Override
    public void show() {
        while (true) {
            printWithdrawCustomMessage();
            print("Enter amount to withdraw: ");

            var amount = scanner.nextLine();

            if (!isValidAmountOfMoney(amount)) {
                printErrorMessage("Invalid amount");
                continue;
            }

            var withdrawAmount = parseInt(amount);

            if (isGreaterThan1000(withdrawAmount)) {
                printErrorMessage("Maximum amount to withdraw is $1000");
                continue;
            }

            if (!isBalanceEnough(withdrawAmount)) {
                printErrorMessage("Insufficient balance $" + withdrawAmount);
                continue;
            }

            if (!isMultiplyOf10(withdrawAmount)) {
                printErrorMessage("Amount must be multiple of 10");
                continue;
            }

            withdraw(withdrawAmount);
            return;
        }
    }

    private void withdraw(int amount) {
        saveWithdrawData(amount);
        printEmptyLine();
        printSuccessMessage("Withdraw success!");
        currentScreen = summaryWithdraw;
    }

    private void saveWithdrawData(int amount) {
        loggedInAccount.setBalance(loggedInAccount.getBalance() - amount);
        withdrawModel = new WithdrawModel(LocalDateTime.now(), amount, loggedInAccount.getBalance(), loggedInAccount);
    }

    private boolean isBalanceEnough(int withdrawAmount) {
        return loggedInAccount.getBalance() >= withdrawAmount;
    }
}
