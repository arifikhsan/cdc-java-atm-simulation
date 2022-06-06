package org.example.screen;

import org.example.model.Card;

import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.example.components.MessageComponent.*;
import static org.example.components.MessageComponent.showInvalidOptionMessage;

public class TransactionScreen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showTransactionScreen(Card currentCard, List<Card> cards) {
        showTransactionScreenMessage();
        showUserInfo(currentCard);
        showOptionMessage();

        while (true) {
            var option = scanner.nextLine();

            if (option.isEmpty()) option = defaultOption();

            if (isInvalidInput(option)) {
                showInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1: {
                    gotoWithdrawScreen();
                    return;
                }
                case 2: {
                    gotoTransferScreen();
                    return;
                }
                case 3: return;
                case 4: exitApp();
                case 5: {
                    showInvalidOptionMessage();
                    showOptionMessage();
                    continue;
                }
                default: {
                    showInvalidOptionMessage(option);
                    showOptionMessage();
                }
            }
        }
    }

    public static void gotoWithdrawScreen() {
        println("withdraw money");
    }

    public static void gotoTransferScreen() {
        println("transfer money");
    }

    public static void showUserInfo(Card currentCard) {
        showFullScreenLine();
        println("Name: " + currentCard.getName());
        println("Account Number: " + currentCard.getNumber());
        println("Balance: USD " + currentCard.getBalance());
        showFullScreenLine();
    }

    public static void showOptionMessage() {
        showFullScreenLine();
        println("1. Withdraw");
        println("2. Transfer");
        println("3. Logout");
        println("4. Exit");
        println("5. Do nothing");
        showFullScreenLine();
        print("Select transaction [5]: ");
    }

    public static String defaultOption() {
        return "5";
    }

    public static Boolean isInvalidInput(String input) {
        return !input.matches("[1-5]");
    }
}

//1. Withdraw
//2. Fund Transfer
//3. Exit
//Please choose option[3]:
