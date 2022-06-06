package org.example.screen;

import org.example.model.Card;

import java.util.List;
import java.util.Scanner;

import static org.example.components.MessageComponent.*;

public class WithdrawScreen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showWithdrawScreen(Card currentCard, List<Card> cards) {
        showWithdrawScreenMessage();
        showBalanceMessage(currentCard);
    }

    public static void showBalanceMessage(Card currentCard) {
        showFullScreenLine();
        System.out.println("Balance: $ " + currentCard.getBalance());
        showFullScreenLine();
    }

    public static void showOptionsMessage() {
        showFullScreenLine();
        println("1. $10");
        println("2. $50");
        println("3. $100");
        println("4. Other");
        println("5. Back");
        showFullScreenLine();
        println("Select Transaction [3]:");
    }
}
