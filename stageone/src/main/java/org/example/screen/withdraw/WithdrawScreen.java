package org.example.screen.withdraw;

import org.example.model.WithdrawModel;
import org.example.screen.contract.ScreenContract;

import java.time.LocalDateTime;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.components.MessageComponent.*;
import static org.example.util.SystemUtil.*;

public class WithdrawScreen extends ScreenContract {
    private static final Integer DEFAULT_CHOICE = 5;

    private void showOptionsMessage() {
        printHorizontalLine();
        println("1. $10");
        println("2. $50");
        println("3. $100");
        println("4. Other");
        println("5. Back");
        printHorizontalLine();
        print("Select Transaction ["+DEFAULT_CHOICE+"]: ");
    }

    private Boolean isInvalidInput(String input) {
        return !input.matches("[1-5]");
    }

    @Override
    public void show() {
        while (true) {
            printWithdrawMessage();
            showBalanceMessage();
            showOptionsMessage();

            var option = scanner.nextLine();
            if (option.isEmpty()) option = DEFAULT_CHOICE.toString();

            if (isInvalidInput(option)) {
                printInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1 -> {
                    withdraw(10);
                    return;
                }
                case 2 -> {
                    withdraw(50);
                    return;
                }
                case 3 -> {
                    withdraw(100);
                    return;
                }
                case 4 -> {
                    currentScreen = otherWithdraw;
                    return;
                }
                case 5 -> {
                    currentScreen = transaction;
                    return;
                }
                default -> printInvalidOptionMessage(option);
            }
        }
    }

    private void withdraw(Integer amount) {
        if (!isBalanceEnough(amount)) {
            printErrorMessage("Insufficient withdraw balance $" + amount);
//            printErrorMessage("Insufficient withdraw balance $" + amount + ". Current balance is $" + loggedInAccount.getBalance());
            return;
        }

        saveWithdrawData(amount);
        printEmptyLine();
        printSuccessMessage("Withdraw success!");
        currentScreen = summaryWithdraw;
    }

    private void saveWithdrawData(Integer amount) {
        loggedInAccount.setBalance(loggedInAccount.getBalance() - amount);
        withdrawModel = new WithdrawModel(LocalDateTime.now(), amount, loggedInAccount.getBalance(), loggedInAccount);
    }

    private Boolean isBalanceEnough(Integer amount) {
        return loggedInAccount.getBalance() >= amount;
    }

    private void showBalanceMessage() {
        printHorizontalLine();
        println("Your balance: $ " + loggedInAccount.getBalance());
        printHorizontalLine();
    }
}
