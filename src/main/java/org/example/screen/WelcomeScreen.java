package org.example.screen;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.example.components.MessageComponent.showGoodBye;
import static org.example.components.MessageComponent.showWelcome;

public class WelcomeScreen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showWelcomeScreen() {
        //noinspection InfiniteLoopStatement
        while (true) {
            showWelcome();
            showOptions();

            var option = scanner.nextLine();

            if (option.isEmpty()) option = "3";

            if (isInvalidInput(option)) {
                showInvalidOption(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1: gotoLoginScreen();
                case 2: exitApp();
                case 3: continue;
                default: showInvalidOption();
            }
        }
    }

    public static void gotoLoginScreen() {
        new LoginScreen().show();
    }

    public static void exitApp() {
        showGoodBye();
        System.exit(0);
    }

    public static Boolean isInvalidInput(String input) {
        return !input.matches("[1-3]"); // valid options are 1, 2, 3
    }

    public static void showInvalidOption(String input) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Your input: " + input);
        System.out.println("Is an invalid option. Please try again.");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void showInvalidOption() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Your input is invalid. Please try again.");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void showOptions() {
        System.out.println("======================================");
        System.out.println("Choice:");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.println("3. Do nothing");
        System.out.println("======================================");
        System.out.print("Please enter your option [3]: ");
    }
}
