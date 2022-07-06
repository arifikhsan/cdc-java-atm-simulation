package org.example.screen.transfer;

import org.example.screen.contract.ScreenContract;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.components.MessageComponent.printErrorMessage;
import static org.example.components.MessageComponent.printTransferInputAmountMessage;
import static org.example.util.NumberUtil.*;
import static org.example.util.SystemUtil.println;

public class TransferInputAmountScreen extends ScreenContract {
    @Override
    public void show() {
        while (true) {
            printTransferInputAmountMessage();
            println("Please enter amount and press enter to continue or");
            println("Press enter to go back");

            var amountString = scanner.nextLine();

            if (amountString.isEmpty()) {
                currentScreen = transferInputAccount;
                return;
            }

            if (!isAStringNumber(amountString)) {
                printErrorMessage("Invalid Amount");
                continue;
            }

            var amount = parseInt(amountString);

            if (isNegative(amount)) {
                printErrorMessage("Minimum amount to transfer is $1");
                continue;
            }

            if (isGreaterThanNumber(amount, 1000)) {
                printErrorMessage("Maximum amount to transfer is $1000");
                continue;
            }

            if (!isEnoughBalance(amount)) {
                printErrorMessage("Insufficient Balance $" + amount);
                continue;
            }

            transferModel.setAmount(amount);
            currentScreen = transferInputReference;
            return;
        }
    }

    private boolean isEnoughBalance(Integer amount) {
        return loggedInAccount.getBalance() >= amount;
    }
}
