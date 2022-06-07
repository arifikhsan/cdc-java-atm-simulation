package org.example.screen.withdraw;

import org.example.model.WithdrawModel;

import java.time.LocalDateTime;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.components.MessageComponent.*;
import static org.example.util.NumberUtil.*;
import static org.example.util.SystemUtil.print;
import static org.example.util.SystemUtil.printNewLine;

public class WithdrawCustomScreen {

    public void show() {
        while (true) {
            printWithdrawCustomScreenMessage();
            print("Enter amount to withdraw: ");

            var amount = scanner.nextLine();

            if (!isValidAmount(amount)) {
                showErrorMessage("Invalid amount");
                continue;
            }

            var withdrawAmount = parseInt(amount);

            if (isGreaterThan1000(withdrawAmount)) {
                showErrorMessage("Maximum amount to withdraw is $1000");
                continue;
            }

            if (!isBalanceEnough(withdrawAmount)) {
                showErrorMessage("Insufficient balance $" + withdrawAmount + ". Current balance is $" + loggedInCard.getBalance());
                continue;
            }

            if (!isMultiplyOf10(withdrawAmount)) {
                showErrorMessage("Amount must be multiple of 10");
                continue;
            }

            withdraw(withdrawAmount);
            return;
        }
    }

    private void withdraw(int amount) {
        loggedInCard.setBalance(loggedInCard.getBalance() - amount);
        var withdrawModel = new WithdrawModel(LocalDateTime.now(), amount, loggedInCard.getBalance(), loggedInCard);
        withdrawRepository.getWithdraws().add(withdrawModel);
        printNewLine();
        showSuccessMessage("Withdraw success!");
        gotoWithdrawSummaryScreen(withdrawModel);
    }

    private void gotoWithdrawSummaryScreen(WithdrawModel withdrawModel) {
        new WithdrawSummaryScreen().show(withdrawModel);
    }

    private boolean isBalanceEnough(int withdrawAmount) {
        return loggedInCard.getBalance() >= withdrawAmount;
    }

    private boolean isValidAmount(String amount) {
        return !amount.isEmpty() && isAStringNumber(amount) && isPositive(parseInt(amount));
    }

}
