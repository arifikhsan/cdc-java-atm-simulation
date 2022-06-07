package org.example.screen.transfer;

import static org.example.Main.*;
import static org.example.components.MessageComponent.showErrorMessage;
import static org.example.components.MessageComponent.showTransferInputAccountScreenMessage;
import static org.example.util.StringUtil.isValidAccountNumber;
import static org.example.util.SystemUtil.println;

public class TransferInputAccountScreen {
    public void show() {
        while (true) {
            showTransferInputAccountScreenMessage();
            println("Please enter destination account and press enter to continue or");
            println("Press enter to go back to main menu");

            var destinationAccountNumber = scanner.nextLine();

            if (destinationAccountNumber.isEmpty()) {
                return;
            }

            if (!isValidAccountNumber(destinationAccountNumber)) {
                showErrorMessage("Invalid Account");
                continue;
            }

            if (!isAccountExist(destinationAccountNumber)) {
                showErrorMessage("Account does not exist");
                continue;
            }

            var destinationAccount = cardRepository.getCardByNumber(destinationAccountNumber);
            transferModel.setFromCard(loggedInCard);
            transferModel.setToCard(destinationAccount);
            new TransferInputAmountScreen().show();
            return;
        }
    }

    private boolean isAccountExist(String destinationAccount) {
        return cardRepository.isExistByNumber(destinationAccount);
    }
}
