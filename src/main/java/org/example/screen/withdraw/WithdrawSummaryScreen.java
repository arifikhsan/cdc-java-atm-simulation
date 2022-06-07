package org.example.screen.withdraw;

import org.example.model.WithdrawModel;

import static java.lang.Integer.parseInt;
import static org.example.Main.dateTimeFormatter;
import static org.example.Main.scanner;
import static org.example.components.MessageComponent.*;
import static org.example.util.SystemUtil.*;

public class WithdrawSummaryScreen {
    public void show(WithdrawModel withdrawModel) {
        while (true) {
            showWithdrawSummaryScreenMessage();
            showSummaryDetailMessage(withdrawModel);
            showOptionsMessage();

            var option = scanner.nextLine();
            if (option.isEmpty()) option = "2";

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

    private void showSummaryDetailMessage(WithdrawModel withdrawModel) {
        println("Summary");
        println("Date: " + withdrawModel .getDatetime().format(dateTimeFormatter));
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

    private Boolean isInvalidInput(String input) {
        return !input.matches("[1-2]");
    }
}
