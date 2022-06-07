package org.example.screen;

import org.example.model.WithdrawModel;

import java.time.LocalDateTime;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.example.Main.cardRepository;
import static org.example.components.MessageComponent.*;
import static org.example.components.MessageComponent.print;

public class WithdrawCustomScreen {
    private final Scanner scanner = new Scanner(System.in);

    public void showWithdrawCustomScreen() {
        while (true) {
            showWithdrawCustomScreenMessage();
            print("Enter amount to withdraw: ");

            var amount = scanner.nextLine();

            if (isInvalidAmount(amount)) {
                showErrorMessage("Invalid amount");
                continue;
            }

            var withdrawAmount = parseInt(amount);

            if (greaterThan1000(withdrawAmount)) {
                showErrorMessage("Maximum amount to withdraw is $1000");
                continue;
            }

            if (!isBalanceEnough(withdrawAmount)) {
                showErrorMessage("Insufficient balance $" + withdrawAmount + ". Current balance is $" + cardRepository.getLoggedInCard().getBalance());
                continue;
            }

            if (multipleOf10(withdrawAmount)) {
                showErrorMessage("Amount must be multiple of 10");
                continue;
            }

            withdraw(withdrawAmount);
            return;
        }
    }

    private void withdraw(int withdrawAmount) {
        cardRepository.getLoggedInCard().setBalance(cardRepository.getLoggedInCard().getBalance() - withdrawAmount);
        var withdrawModel = new WithdrawModel(LocalDateTime.now(), withdrawAmount, cardRepository.getLoggedInCard().getBalance(), cardRepository.getLoggedInCard());
        println("");
        showSuccessMessage("Withdraw success!");
        gotoWithdrawSummaryScreen(withdrawModel);
    }

    private void gotoWithdrawSummaryScreen(WithdrawModel withdrawModel) {
        new WithdrawSummaryScreen(withdrawModel).showWithdrawSummaryScreen();
    }

    private boolean multipleOf10(int withdrawAmount) {
        return withdrawAmount % 10 != 0;
    }

    private boolean isBalanceEnough(int withdrawAmount) {
        return cardRepository.getLoggedInCard().getBalance() >= withdrawAmount;
    }

    private boolean greaterThan1000(int withdrawAmount) {
        return withdrawAmount > 1000;
    }

    private boolean isInvalidAmount(String amount) {
        if (amount.isEmpty()) return true;
        return !amount.matches("\\d+"); // if not a number
    }

}
