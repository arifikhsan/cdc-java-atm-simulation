package org.example.screen.transfer;

import org.example.screen.contract.ScreenContract;

import static org.example.StageOneApplication.*;
import static org.example.components.MessageComponent.printErrorMessage;
import static org.example.components.MessageComponent.printTransferInputAccountMessage;
import static org.example.util.StringUtil.isValidAccountNumber;
import static org.example.util.SystemUtil.println;

public class TransferInputAccountScreen extends ScreenContract {
    @Override
    public void show() {
        while (true) {
            printTransferInputAccountMessage();
            println("Please enter destination account and press enter to continue or");
            println("Press enter to go back to main menu");

            var destinationAccountNumber = scanner.nextLine();

            if (destinationAccountNumber.isEmpty()) {
                currentScreen = transaction;
                return;
            }

            if (!isValidAccountNumber(destinationAccountNumber)) {
                printErrorMessage("Invalid Account");
                continue;
            }

            if (!isAccountExist(destinationAccountNumber)) {
                printErrorMessage("Account does not exist");
                continue;
            }

            if (isMyOwnAccount(destinationAccountNumber)) {
                printErrorMessage("You can't transfer to your own account");
                continue;
            }

            var destinationAccount = cardRepository.getCardByNumber(destinationAccountNumber);
            transferModel.setFromCard(loggedInAccount);
            transferModel.setToCard(destinationAccount);
            currentScreen = transferInputAmount;
            return;
        }
    }

    private boolean isMyOwnAccount(String destinationAccountNumber) {
        return loggedInAccount.getNumber().equals(destinationAccountNumber);
    }

    private boolean isAccountExist(String destinationAccount) {
        return cardRepository.isExistByCardNumber(destinationAccount);
    }
}
