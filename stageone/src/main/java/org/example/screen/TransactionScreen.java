package org.example.screen;

import org.example.screen.contract.ScreenContract;

import static java.lang.Integer.parseInt;
import static org.example.Main.loggedInAccount;
import static org.example.Main.scanner;
import static org.example.components.MessageComponent.*;
import static org.example.util.SystemUtil.*;

public class TransactionScreen extends ScreenContract {
    private static final Integer DEFAULT_CHOICE = 3;

    private void showOptionMessage() {
        printHorizontalLine();
        println("1. Withdraw");
        println("2. Fund Transfer");
        println("3. Exit"); // back to login screen
        printHorizontalLine();
        print("Select transaction [" + DEFAULT_CHOICE + "]: ");
    }

    private Boolean isInvalidInput(String input) {
        return !input.matches("[1-3]");
    }

    @Override
    public void show() {
        while (true) {
            printTransactionMessage();
            showUserInfo();
            showOptionMessage();

            var option = scanner.nextLine();
            printEmptyLine();

            if (option.isEmpty()) option = DEFAULT_CHOICE.toString();

            if (isInvalidInput(option)) {
                printInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1 -> {
                    currentScreen = withdraw;
                    return;
                }
                case 2 -> {
                    currentScreen = transferInputAccount;
                    return;
                }
                case 3 -> {
                    currentScreen = welcome;
                    return;
                }
                default -> {
                    printInvalidOptionMessage(option);
                }
            }
        }
    }

    private void showUserInfo() {
        printHorizontalLine();
        println("Name: " + loggedInAccount.getName());
        println("Account Number: " + loggedInAccount.getNumber());
        println("Balance: $" + loggedInAccount.getBalance());
        printHorizontalLine();
    }
}
