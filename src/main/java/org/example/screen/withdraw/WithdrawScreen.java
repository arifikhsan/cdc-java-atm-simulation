package org.example.screen.withdraw;

import org.example.model.WithdrawModel;

import java.time.LocalDateTime;

import static java.lang.Integer.parseInt;
import static org.example.Main.cardRepository;
import static org.example.Main.scanner;
import static org.example.components.MessageComponent.*;

public class WithdrawScreen {
    public void showWithdrawScreen() {
        while (true) {
            showWithdrawScreenMessage();
            showBalanceMessage();
            showOptionsMessage();

            var option = scanner.nextLine();
            if (option.isEmpty()) option = defaultOption();

            if (isInvalidInput(option)) {
                showInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1 -> withdraw(10);
                case 2 -> withdraw(50);
                case 3 -> withdraw(100);
                case 4 -> gotoWithdrawCustomScreen();
                case 5 -> {
                    return;
                }
                default -> showInvalidOptionMessage(option);
            }
        }
    }

    private void gotoWithdrawCustomScreen() {
        new WithdrawCustomScreen().showWithdrawCustomScreen();
    }

    private void gotoWithdrawSummaryScreen(WithdrawModel withdrawModel) {
        new WithdrawSummaryScreen(withdrawModel).showWithdrawSummaryScreen();
    }

    private void withdraw(Integer amount) {
        if (!isBalanceEnough(amount)) {
            showErrorMessage("Insufficient balance $ " + cardRepository.getLoggedInCard().getBalance());
            return;
        }

        cardRepository.getLoggedInCard().setBalance(cardRepository.getLoggedInCard().getBalance() - amount);
        var withdrawModel = new WithdrawModel(LocalDateTime.now(), amount, cardRepository.getLoggedInCard().getBalance(), cardRepository.getLoggedInCard());
        println("");
        showSuccessMessage("Withdraw success!");
        gotoWithdrawSummaryScreen(withdrawModel);
    }

    private Boolean isBalanceEnough(Integer amount) {
        return cardRepository.getLoggedInCard().getBalance() >= amount;
    }

    private void showBalanceMessage() {
        printHorizontalLine();
        println("Your balance: $ " + cardRepository.getLoggedInCard().getBalance());
        printHorizontalLine();
    }

    private void showOptionsMessage() {
        printHorizontalLine();
        println("1. $10");
        println("2. $50");
        println("3. $100");
        println("4. Other");
        println("5. Back");
        printHorizontalLine();
        print("Select Transaction [5]: ");
    }

    private String defaultOption() {
        return "5";
    }

    private Boolean isInvalidInput(String input) {
        return !input.matches("[1-5]");
    }
}
