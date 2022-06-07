package org.example.screen;

import static org.example.Main.*;
import static org.example.components.MessageComponent.*;

public class TransferSummaryScreen {
    public void show() {
//        while (true) {
            showTransferSummaryScreenMessage();
            showSummary();

//            return;
//        }

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
