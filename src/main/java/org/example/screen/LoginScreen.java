package org.example.screen;

import org.example.exception.NotFoundException;
import org.example.model.Card;
import org.example.seeder.CardSeeder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import static java.util.Collections.unmodifiableList;
import static org.example.components.MessageComponent.*;

public class LoginScreen {
    private static final List<Card> cards = CardSeeder.seed();
    private static final Scanner scanner = new Scanner(System.in);

    public static void showLoginScreen() {
        String cardNumber;
        String pin;
        Card currentCard;

        while (true) {
            showLoginScreenMessage();

            System.out.print("Enter your card number: ");
            cardNumber = scanner.nextLine();
            System.out.println("Your card number is " + cardNumber);

            System.out.print("Enter your PIN: ");
            pin = scanner.nextLine();
            System.out.println("Your PIN is " + pin);

            try {
                currentCard = login(cardNumber, pin);
                showSuccessMessage("Welcome, " + currentCard.getName());
                gotoTransactionScreen(currentCard, cards);
                return;
            } catch (NotFoundException e) {
                showErrorMessage("Login failed. Please try again.");
            }
        }
    }

    public static void gotoTransactionScreen(Card currentCard, List<Card> cards) {
        TransactionScreen.showTransactionScreen(currentCard, cards);
    }

    public static Card login(String cardNumber, String pin) throws NotFoundException {
        return cards.stream()
                .filter(card -> card.getNumber().equals(cardNumber) && card.getPin().equals(pin))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}
