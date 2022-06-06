package org.example.screen;

import org.example.repository.CardRepository;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.example.components.MessageComponent.*;

public class WelcomeScreen {
    private final CardRepository cardRepository;

    private final Scanner scanner = new Scanner(System.in);

    public WelcomeScreen(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void showWelcomeScreen() {
        //noinspection InfiniteLoopStatement
        while (true) {
            showWelcomeMessage();
            showOptionsMessage();

            var option = scanner.nextLine();

            if (option.isEmpty()) option = "3";

            if (isInvalidInput(option)) {
                showInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1: {
                    gotoLoginScreen();
                    continue;
                }
                case 2: exitApp();
                case 3: continue;
                default: showInvalidOptionMessage(option);
            }
        }
    }

    private void gotoLoginScreen() {
        new LoginScreen(cardRepository).showLoginScreen();
    }

    private Boolean isInvalidInput(String input) {
        return !input.matches("[1-3]"); // valid options are 1, 2, 3
    }

    private void showOptionsMessage() {
        println("======================================");
        println("Choice:");
        println("1. Login");
        println("2. Exit");
        println("3. Do nothing");
        println("======================================");
        print("Please enter your option [3]: ");
    }
}
