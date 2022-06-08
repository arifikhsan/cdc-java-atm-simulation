package org.example.screen.transfer;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.components.MessageComponent.printHorizontalLine;
import static org.example.components.MessageComponent.printTransferConfirmationMessage;
import static org.example.util.NumberUtil.isAStringNumber;
import static org.example.util.NumberUtil.isPositive;
import static org.example.util.SystemUtil.*;

public class TransferConfirmationScreen {
    public void show() {
        while (true) {
            printTransferConfirmationMessage();
            showSummary();
            showOptionMessage();

            var option = scanner.nextLine();
            printEmptyLine();

            if (option.isEmpty()) option = "2";

            if (!isValidOption(option)) {
                println("Invalid Input");
                continue;
            }

            if (parseInt(option) == 1) {
                transferMoney();
                gotoSummaryScreen();
            }

            return;
        }
    }

    private void transferMoney() {
        transferRepository.getTransfers().add(transferModel);
        loggedInCard.setBalance(loggedInCard.getBalance() - transferModel.getAmount());
        transferModel.getToCard().setBalance(transferModel.getToCard().getBalance() + transferModel.getAmount());
    }

    private void gotoSummaryScreen() {
        new TransferSummaryScreen().show();
    }

    private boolean isValidOption(String option) {
        return isAStringNumber(option) && isPositive(parseInt(option)) && isIncludedInOption(option);
    }

    private boolean isIncludedInOption(String option) {
        return option.matches("[1-3]");
    }

    private void showOptionMessage() {
        printHorizontalLine();
        println();
        println("1. Confirm Transaction");
        println("2. Cancel Transaction");
        println();
        printHorizontalLine();
        print("Choose option [2]: ");
    }

    private void showSummary() {
        printHorizontalLine();
        println("Destination Account: " + transferModel.getToCard().getNumber());
        println("Amount: $" + transferModel.getAmount());
        println("Reference Number: " + transferModel.getReference());
        printHorizontalLine();
    }
}
