package org.example;

import org.example.model.Card;
import org.example.screen.TransactionScreen;
import org.example.screen.WelcomeScreen;
import org.example.seeder.CardSeeder;

import java.io.IOException;
import java.util.Set;

public class Main {
    private final Set<Card> cards = CardSeeder.seed();
    private static final WelcomeScreen welcomeScreen = new WelcomeScreen();
    private static Card currentCard;

    public static void main(String[] args) throws IOException {
        while (true) {
            currentCard = welcomeScreen.show();
            var transactionScreen = new TransactionScreen(currentCard);
            var state = transactionScreen.show();

            if (state.equals("logout")) {
                System.out.println("Logout");
            } else if (state.equals("exit")) {
                System.out.println("Exit");
                break;
            }
        }
    }
}
