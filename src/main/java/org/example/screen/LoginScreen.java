package org.example.screen;

import static org.example.Main.*;
import static org.example.components.MessageComponent.*;
import static org.example.util.NumberUtil.isAStringNumber;
import static org.example.util.StringUtil.isExact6Digits;
import static org.example.util.SystemUtil.print;
import static org.example.util.SystemUtil.println;

public class LoginScreen {

    public void show() {
        String cardNumber;
        String pin;

        while (true) {
            printLoginScreenMessage();

            print("Enter your card number: ");
            cardNumber = scanner.nextLine();

            if (cardNumber.isEmpty()) {
                showErrorMessage("Please enter your card number");
                continue;
            }

            if (!isAStringNumber(cardNumber)) {
                showErrorMessage("Account Number should only contains numbers");
                continue;
            }

            if (!isExact6Digits(cardNumber)) {
                showErrorMessage("Account Number should have 6 digits length");
                continue;
            }

            println("Your card number is " + cardNumber);

            print("Enter your PIN: ");
            pin = scanner.nextLine();

            if (pin.isEmpty()) {
                showErrorMessage("Please enter your PIN");
                continue;
            }

            if (!isAStringNumber(pin)) {
                showErrorMessage("PIN should only contains numbers");
                continue;
            }

            if (!isExact6Digits(pin)) {
                showErrorMessage("PIN should have 6 digits length");
                continue;
            }

            println("Your PIN is " + pin);

            if (!cardRepository.isExistByNumberAndPin(cardNumber, pin)) {
                showErrorMessage("Wrong card number or PIN");
                continue;
            }

            loggedInCard = cardRepository.getCardByNumber(cardNumber);
            showSuccessMessage("Welcome, " + loggedInCard.getName());
            gotoTransactionScreen();
            return;
        }
    }

    public void gotoTransactionScreen() {
        new TransactionScreen().show();
    }
}
