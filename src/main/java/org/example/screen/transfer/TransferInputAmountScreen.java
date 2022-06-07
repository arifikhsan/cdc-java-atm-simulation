package org.example.screen.transfer;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.components.MessageComponent.showErrorMessage;
import static org.example.components.MessageComponent.showTransferInputAmountScreenMessage;
import static org.example.util.NumberUtil.*;
import static org.example.util.SystemUtil.println;

public class TransferInputAmountScreen {
    public void show() {
        while (true) {
            showTransferInputAmountScreenMessage();
            println("Please enter amount and press enter to continue or");
            println("Press enter to go back");

            var amountString = scanner.nextLine();

            if (amountString.isEmpty()) {
                return;
            }

            if (!isAStringNumber(amountString)) {
                showErrorMessage("Invalid Amount");
                continue;
            }

            var amount = parseInt(amountString);

            if (isNegative(amount)) {
                showErrorMessage("Minimum amount to transfer is $1");
                continue;
            }

            if (isGreaterThan1000(amount)) {
                showErrorMessage("Maximum amount to transfer is $1000");
                continue;
            }

            if (!isEnoughBalance(amount)) {
                showErrorMessage("Insufficient Balance $" + amount + " in your account. " +
                        "Your balance is $" + loggedInCard.getBalance());
                continue;
            }

            transferModel.setAmount(amount);
            new TransferInputReferenceScreen().show();
            return;
        }
    }

    private boolean isEnoughBalance(Integer amount) {
        return loggedInCard.getBalance() >= amount;
    }
}
