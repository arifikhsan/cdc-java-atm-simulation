package org.example.screen;

import org.example.screen.withdraw.WithdrawScreen;

import static java.lang.Integer.parseInt;
import static org.example.Main.cardRepository;
import static org.example.Main.scanner;
import static org.example.components.MessageComponent.*;

public class TransactionScreen {
    public static boolean backToHere = false;

    public void showTransactionScreen() {
        while (true) {
            showTransactionScreenMessage();
            showUserInfo();
            showOptionMessage();

            var option = scanner.nextLine();

            if (option.isEmpty()) option = defaultOption();

            if (isInvalidInput(option)) {
                showInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1: {
                    gotoWithdrawScreen();
                    continue;
                }
                case 2: {
                    gotoTransferScreen();
                    continue;
//                    break;
                }
                case 3: return;
                case 4: exitApp();
                case 5: {
                    continue;
                }
                default: {
                    showInvalidOptionMessage(option);
                }
            }
        }
    }

    private void gotoWithdrawScreen() {
        new WithdrawScreen().showWithdrawScreen();
    }

    private void gotoTransferScreen() {
        new TransferInputAccountScreen().showTransferScreen();
    }

    private void showUserInfo() {
        printHorizontalLine();
        println("Name: " + cardRepository.getLoggedInCard().getName());
        println("Account Number: " + cardRepository.getLoggedInCard().getNumber());
        println("Balance: USD " + cardRepository.getLoggedInCard().getBalance());
        printHorizontalLine();
    }

    private void showOptionMessage() {
        printHorizontalLine();
        println("1. Withdraw");
        println("2. Transfer");
        println("3. Logout");
        println("4. Exit");
        println("5. Do nothing");
        printHorizontalLine();
        print("Select transaction [5]: ");
    }

    private String defaultOption() {
        return "5";
    }

    private Boolean isInvalidInput(String input) {
        return !input.matches("[1-5]");
    }
}

//1. Withdraw
//2. Fund Transfer
//3. Exit
//Please choose option[3]:
