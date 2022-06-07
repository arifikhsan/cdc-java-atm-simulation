package org.example.components;

import static org.example.util.SystemUtil.println;

public class MessageComponent {
    public static void printWelcomeMessage() {
        println("======================================");
        println("||     Welcome to Very Good ATM     ||");
        println("======================================");
    }

    public static void printLoginScreenMessage() {
        println("======================================");
        println("||       Login | Very Good ATM      ||");
        println("======================================");
    }

    public static void printTransactionScreenMessage() {
        println("======================================");
        println("||   Transaction | Very Good ATM    ||");
        println("======================================");
    }

    public static void printWithdrawScreenMessage() {
        println("======================================");
        println("||  Withdraw Money | Very Good ATM  ||");
        println("======================================");
    }

    public static void printWithdrawCustomScreenMessage() {
        println("======================================");
        println("||  Other Withdraw | Very Good ATM  ||");
        println("======================================");
    }

    public static void showWithdrawSummaryScreenMessage() {
        println("======================================");
        println("|| Withdraw Summary | Very Good ATM ||");
        println("======================================");
    }

    public static void showTransferInputAccountScreenMessage() {
        println("======================================");
        println("||  Transfer Money | Very Good ATM  ||");
        println("======================================");
        println("||       Input Account Number       ||");
        println("======================================");
    }

    public static void showTransferInputAmountScreenMessage() {
        println("======================================");
        println("||  Transfer Money | Very Good ATM  ||");
        println("======================================");
        println("||            Input Amount          ||");
        println("======================================");
    }

    public static void showTransferInputReferenceScreenMessage() {
        println("======================================");
        println("||  Transfer Money | Very Good ATM  ||");
        println("======================================");
        println("||      Input Reference Number      ||");
        println("======================================");
    }

    public static void showTransferSummaryScreenMessage() {
        println("======================================");
        println("||          Very Good ATM           ||");
        println("======================================");
        println("||      Fund Transfer Summary       ||");
        println("======================================");
    }

    public static void showTransferConfirmationScreenMessage() {
        println("======================================");
        println("||          Very Good ATM           ||");
        println("======================================");
        println("||       Transfer Confirmation      ||");
        println("======================================");
    }

    public static void showGoodByeMessage() {
        println("======================================");
        println("||            Good Bye !!!          ||");
        println("======================================");
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

    public static void showInvalidInputMessage() {
        printErrorLine();
        println("Your input is invalid. Please try again.");
        printErrorLine();
    }
}
