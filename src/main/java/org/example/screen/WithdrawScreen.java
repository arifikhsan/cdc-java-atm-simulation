package org.example.screen;

import org.example.model.Card;

import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.example.components.MessageComponent.*;

public class WithdrawScreen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showWithdrawScreen(Card currentCard, List<Card> cards) {
        while (true) {
            showWithdrawScreenMessage();
            showBalanceMessage(currentCard);
            showOptionsMessage();

            var option = scanner.nextLine();
            if (option.isEmpty()) option = defaultOption();

            if (isInvalidInput(option)) {
                showInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1 -> withdraw(currentCard, 10);
                case 2 -> withdraw(currentCard, 50);
                case 3 -> withdraw(currentCard, 100);
                case 4 -> withdraw(currentCard, 500);
                case 5 -> {
                    return;
                }
                default -> showInvalidOptionMessage(option);
            }
        }
    }

    private static void withdraw(Card currentCard, Integer amount) {
        if (!isBalanceEnough(currentCard, amount)) {
            showErrorMessage("Not enough balance");
            return;
        }

        currentCard.setBalance(currentCard.getBalance() - amount);
        showSuccessMessage("Withdraw success!");
        showBalanceMessage(currentCard);
    }

    private static Boolean isBalanceEnough(Card currentCard, Integer amount) {
        return currentCard.getBalance() > amount;
    }

    private static void showBalanceMessage(Card currentCard) {
        printHorizontalLine();
        println("Your balance: $ " + currentCard.getBalance());
        printHorizontalLine();
    }

    private static void showOptionsMessage() {
        printHorizontalLine();
        println("1. $10");
        println("2. $50");
        println("3. $100");
        println("4. Other");
        println("5. Back");
        printHorizontalLine();
        print("Select Transaction [5]: ");
    }

    private static String defaultOption() {
        return "5";
    }

    private static Boolean isInvalidInput(String input) {
        return !input.matches("[1-5]");
    }
}
