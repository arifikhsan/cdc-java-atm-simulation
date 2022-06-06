package org.example;

import org.example.repository.CardRepository;
import org.example.screen.WelcomeScreen;
import org.example.seeder.CardSeeder;

public class Main {
    public static void main(String[] args) {
        var cardRepository = new CardRepository(CardSeeder.seed(), null);

        new WelcomeScreen(cardRepository).showWelcomeScreen();
    }
}
