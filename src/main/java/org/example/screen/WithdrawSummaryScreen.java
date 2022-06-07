package org.example.screen;

import org.example.model.WithdrawModel;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.time.format.DateTimeFormatter.ofPattern;
import static org.example.Main.withdrawRepository;
import static org.example.components.MessageComponent.*;

public class WithdrawSummaryScreen {
    private final WithdrawModel withdrawModel;
    private final Scanner scanner = new Scanner(System.in);


    public WithdrawSummaryScreen(WithdrawModel withdrawModel) {
        this.withdrawModel = withdrawModel;
        withdrawRepository.getWithdraws().add(withdrawModel);
    }

    public void showWithdrawSummaryScreen() {
        while (true) {
            showWithdrawSummaryScreenMessage();
            showSummaryDetailMessage();
            showOptionsMessage();

            var option = scanner.nextLine();
            if (option.isEmpty()) option = defaultOption();

            if (isInvalidInput(option)) {
                showInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1 -> {
                    return;
                }
                // how to go back to welcome page?
                case 2 -> exitApp();
                default -> showInvalidOptionMessage(option);
            }
        }
    }

    private void showSummaryDetailMessage() {
        println("Summary");
        println("Date: " + withdrawModel.getDatetime().format(ofPattern("yyyy-MM-dd HH:mm a")));
        println("Withdraw amount: $ " + withdrawModel.getAmount());
        println("Current Balance: $ " + withdrawModel.getCard().getBalance());
    }

    private void showOptionsMessage() {
        printHorizontalLine();
        println("1. Back");
        println("2. Exit");
        printHorizontalLine();
        print("Select Transaction [2]: ");
    }

    private String defaultOption() {
        return "2";
    }

    private Boolean isInvalidInput(String input) {
        return !input.matches("[1-2]");
    }
}
