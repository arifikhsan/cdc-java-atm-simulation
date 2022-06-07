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

    public static void showWithdrawCustomScreenMessage() {
        println("======================================");
        println("||  Other Withdraw | Very Good ATM  ||");
        println("======================================");
    }

    public static void showWithdrawSummaryScreenMessage() {
        println("======================================");
        println("||         Withdraw Summary         ||");
        println("======================================");
    }

    public static void showTransferScreenMessage() {
        println("======================================");
        println("||  Transfer Money | Very Good ATM  ||");
        println("======================================");
    }

    public static void showGoodBye() {
        printHorizontalLine();
        println("||            Good Bye !!!          ||");
        printHorizontalLine();
    }

    public static void showErrorMessage(String message) {
        printErrorLine();
        println(message);
        printErrorLine();
    }

    public static void showSuccessMessage(String message) {
        printHorizontalLine();
        println(message);
        printHorizontalLine();
    }

    public static void printHorizontalLine() {
        println("======================================");
    }

    public static void printErrorLine() {
        println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void showInvalidOptionMessage(String input) {
        printErrorLine();
        println("Your input: " + input);
        println("Is an invalid option. Please try again.");
        printErrorLine();
    }

    public static void showInvalidOptionMessage() {
        printErrorLine();
        println("Your input is invalid. Please try again.");
        printErrorLine();
    }

    public static void println(String string) {
        System.out.println(string);
    }

    public static void print(String string) {
        System.out.print(string);
    }

    public static void exitApp() {
        showGoodBye();
        exitConsoleApp();
    }

    public static void exitConsoleApp() {
        System.exit(0);
    }
}
