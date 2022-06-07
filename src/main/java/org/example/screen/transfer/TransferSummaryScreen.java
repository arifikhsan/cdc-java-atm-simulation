package org.example.screen.transfer;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.components.MessageComponent.*;
import static org.example.util.NumberUtil.isAStringNumber;
import static org.example.util.NumberUtil.isPositive;

public class TransferSummaryScreen {
    public void show() {
        while (true) {
            showTransferSummaryScreenMessage();
            showSummary();
            showOptionMessage();

            var option = scanner.nextLine();
            println();

            if (option.isEmpty()) option = "2";

            if (!isValidOption(option)) {
                println("Invalid Input");
                continue;
            }

            if (parseInt(option) == 2) {
                exitApp();
            }

            return;
        }

    }

    private boolean isValidOption(String option) {
        return isAStringNumber(option) && isPositive(parseInt(option)) && isIncludedInOption(option);
    }

    private boolean isIncludedInOption(String option) {
        return option.matches("[1-2]");
    }

    private void showOptionMessage() {
        printHorizontalLine();
        println("1. Back to Transaction");
        println("2. Exit");
        printHorizontalLine();
        print("Choose option [2]: ");
    }

    private void showSummary() {
        printHorizontalLine();
        println("Destination Account: " + transferModel.getToCard().getNumber());
        println("Amount: $" + transferModel.getAmount());
        println("Reference Number: " + transferModel.getReference());
        println("Current Balance: $" + cardRepository.getLoggedInCard().getBalance());
        println("Date: " + transferModel.getDateTime().format(dateTimeFormatter));
        printHorizontalLine();
    }
}