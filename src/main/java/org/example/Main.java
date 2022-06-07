package org.example;

import org.example.repository.CardRepository;
import org.example.repository.WithdrawRepository;
import org.example.screen.WelcomeScreen;
import org.example.seeder.CardSeeder;

public class Main {
    public static final CardRepository cardRepository = new CardRepository(CardSeeder.seed(), null);
    public static WithdrawRepository withdrawRepository = new WithdrawRepository();

    public static void main(String[] args) {

        new WelcomeScreen(cardRepository).showWelcomeScreen();
    }
}
