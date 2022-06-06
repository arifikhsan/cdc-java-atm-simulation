package org.example.components;

public class MessageComponent {
    public static void showWelcomeMessage() {
        println("======================================");
        println("||     Welcome to Very Good AT      ||");
        println("======================================");
    }

    public static void showLoginScreenMessage() {
        println("======================================");
        println("||       Login | Very Good ATM      ||");
        println("======================================");
    }

    public static void showTransactionScreenMessage() {
        println("======================================");
        println("||   Transaction | Very Good ATM    ||");
        println("======================================");
    }

    public static void showWithdrawScreenMessage() {
        println("======================================");
        println("||  Withdraw Money | Very Good ATM  ||");
        println("======================================");
    }

    public static void showTransferScreenMessage() {
        println("======================================");
        println("||  Transfer Money | Very Good ATM  ||");
        println("======================================");
    }

    public static void showGoodBye() {
        showFullScreenLine();
        println("||            Good Bye !!!          ||");
        showFullScreenLine();
    }

    public static void showErrorMessage(String message) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(message);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void showSuccessMessage(String message) {
        showFullScreenLine();
        System.out.println(message);
        showFullScreenLine();
    }

    public static void showFullScreenLine() {
        System.out.println("======================================");
    }

    public static void showInvalidOptionMessage(String input) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Your input: " + input);
        System.out.println("Is an invalid option. Please try again.");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void showInvalidOptionMessage() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Your input is invalid. Please try again.");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void println(String string) {
        System.out.println(string);
    }

    public static void print(String string) {
        System.out.print(string);
    }

    public static void exitApp() {
        showGoodBye();
        System.exit(0);
    }
}
