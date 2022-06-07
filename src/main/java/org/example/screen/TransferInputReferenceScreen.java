package org.example.screen;

import java.time.LocalDateTime;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.util.NumberUtil.generateRandomSixDigitNumber;
import static org.example.util.NumberUtil.isNumber;
import static org.example.components.MessageComponent.*;

public class TransferInputReferenceScreen {
    public void show() {
        while (true) {
            var referenceNumber = generateRandomSixDigitNumber();

            showTransferInputReferenceScreenMessage();
            println("Reference Number (This is an autogenerated random 6 digits number)");
            println(referenceNumber.toString());
            println("Press enter to continue");

//            var reference = scanner.nextLine();

            if (referenceNumber.toString().isEmpty()) {
                showErrorMessage("Invalid Reference Number");
                continue;
            }

            if (!isNumber(referenceNumber.toString())) {
                showErrorMessage("Invalid Reference Number");
                continue;
            }

            transferModel.setReference(referenceNumber);
            transferModel.setDateTime(LocalDateTime.now());
            transferRepository.getTransfers().add(transferModel);
            new TransferSummaryScreen().show();
            return;
        }
    }

    private boolean isEnoughBalance(String reference) {
        return cardRepository.getLoggedInCard().getBalance() >= parseInt(reference);
    }
}