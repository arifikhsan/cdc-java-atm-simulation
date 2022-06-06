package org.example.screen;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.example.components.MessageComponent.*;

public class WelcomeScreen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showWelcomeScreen() {
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

    public static void gotoLoginScreen() {
        LoginScreen.showLoginScreen();
    }

    public static Boolean isInvalidInput(String input) {
        return !input.matches("[1-3]"); // valid options are 1, 2, 3
    }

    public static void showOptionsMessage() {
        System.out.println("======================================");
        System.out.println("Choice:");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.println("3. Do nothing");
        System.out.println("======================================");
        System.out.print("Please enter your option [3]: ");
    }
}
