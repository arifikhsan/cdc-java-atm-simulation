package org.example.screen;

import static org.example.Main.*;
import static org.example.components.MessageComponent.*;

public class TransferInputAccountScreen {

    public void showTransferScreen() {
        while (true) {
            showTransferInputAccountScreenMessage();
            println("Please enter destination account and press enter to continue or");
            println("Press enter to go back to main menu");

            var destinationAccountNumber = scanner.nextLine();

            if (destinationAccountNumber.isEmpty()) {
                return;
            }

            if (!isValidInput(destinationAccountNumber)) {
                showErrorMessage("Invalid Account");
                continue;
            }

            if (!isAccountExist(destinationAccountNumber)) {
                showErrorMessage("Account does not exist");
                continue;
            }

            var destinationAccount = cardRepository.getCardByNumber(destinationAccountNumber);
            transferModel.setFromCard(cardRepository.getLoggedInCard());
            transferModel.setToCard(destinationAccount);
            new TransferInputAmountScreen().showTransferInputAmountScreen();
            return;
        }
    }

    private boolean isAccountExist(String destinationAccount) {
        return cardRepository.existCardByNumber(destinationAccount);
    }

    private boolean isValidInput(String destinationAccount) {
        return !destinationAccount.matches("\\d+");
    }
}
