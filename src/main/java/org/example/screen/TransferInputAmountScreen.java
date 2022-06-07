package org.example.screen;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.util.NumberUtil.isNumber;
import static org.example.components.MessageComponent.*;

public class TransferInputAmountScreen {
    public void showTransferInputAmountScreen() {
        while (true) {
            showTransferInputAmountScreenMessage();
            println("Please enter amount and press enter to continue or");
            println("Press enter to go back");

            var amount = scanner.nextLine();

            if (amount.isEmpty()) {
                return;
            }

            if (!isNumber(amount)) {
                showErrorMessage("Invalid Amount");
                continue;
            }

            if (parseInt(amount) < 1) {
                showErrorMessage("Minimum amount to transfer is $1");
                continue;
            }

            if (parseInt(amount) > 1000) {
                showErrorMessage("Maximum amount to transfer is $1000");
                continue;
            }

            if (!isEnoughBalance(amount)) {
                showErrorMessage("Insufficient Balance $" + amount + " in your account. " +
                        "Your balance is $" + cardRepository.getLoggedInCard().getBalance());
                continue;
            }

            transferModel.setAmount(parseInt(amount));
            new TransferInputReferenceScreen().show();
        }
    }

    private boolean isEnoughBalance(String amount) {
        return cardRepository.getLoggedInCard().getBalance() >= parseInt(amount);
    }
}
