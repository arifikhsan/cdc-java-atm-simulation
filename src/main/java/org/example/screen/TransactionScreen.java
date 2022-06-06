package org.example.screen;

import org.example.model.Card;

import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.example.components.MessageComponent.*;
import static org.example.components.MessageComponent.showInvalidOptionMessage;
import static org.example.screen.TransferScreen.showTransferScreen;
import static org.example.screen.WithdrawScreen.showWithdrawScreen;

public class TransactionScreen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showTransactionScreen(Card currentCard, List<Card> cards) {
        while (true) {
            showTransactionScreenMessage();
            showUserInfo(currentCard);
            showOptionMessage();

            var option = scanner.nextLine();

            if (option.isEmpty()) option = defaultOption();

            if (isInvalidInput(option)) {
                showInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1: {
                    gotoWithdrawScreen(currentCard, cards);
                    continue;
                }
                case 2: {
                    gotoTransferScreen(currentCard, cards);
                    continue;
                }
                case 3: return;
                case 4: exitApp();
                case 5: {
                    continue;
                }
                default: {
                    showInvalidOptionMessage(option);
                }
            }
        }
    }

    public static void gotoWithdrawScreen(Card currentCard, List<Card> cards) {
        showWithdrawScreen(currentCard, cards);
    }

    public static void gotoTransferScreen(Card currentCard, List<Card> cards) {
        showTransferScreen(currentCard, cards);
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

    private static Boolean isInvalidInput(String input) {
        return !input.matches("[1-5]");
    }
}

//1. Withdraw
//2. Fund Transfer
//3. Exit
//Please choose option[3]:
