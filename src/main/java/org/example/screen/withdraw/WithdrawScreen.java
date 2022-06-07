package org.example.screen.withdraw;

import org.example.model.WithdrawModel;

import java.time.LocalDateTime;

import static java.lang.Integer.parseInt;
import static org.example.Main.*;
import static org.example.components.MessageComponent.*;
import static org.example.util.SystemUtil.*;

public class WithdrawScreen {
    public void show() {
        while (true) {
            printWithdrawScreenMessage();
            showBalanceMessage();
            showOptionsMessage();

            var option = scanner.nextLine();
            if (option.isEmpty()) option = "5";

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
        new WithdrawCustomScreen().show();
    }

    private void gotoWithdrawSummaryScreen(WithdrawModel withdrawModel) {
        new WithdrawSummaryScreen().show(withdrawModel);
    }

    private void withdraw(Integer amount) {
        if (!isBalanceEnough(amount)) {
            showErrorMessage("Insufficient withdraw balance $" + amount + ". Current balance is $" + loggedInCard.getBalance());
            return;
        }

        var withdrawModel = saveWithdrawData(amount);
        printNewLine();
        showSuccessMessage("Withdraw success!");
        gotoWithdrawSummaryScreen(withdrawModel);
    }

    private WithdrawModel saveWithdrawData(Integer amount) {
        loggedInCard.setBalance(loggedInCard.getBalance() - amount);
        var withdrawModel = new WithdrawModel(LocalDateTime.now(), amount, loggedInCard.getBalance(), loggedInCard);
        withdrawRepository.getWithdraws().add(withdrawModel);
        return withdrawModel;
    }

    private Boolean isBalanceEnough(Integer amount) {
        return loggedInCard.getBalance() >= amount;
    }

    private void showBalanceMessage() {
        printHorizontalLine();
        println("Your balance: $ " + loggedInCard.getBalance());
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

    private Boolean isInvalidInput(String input) {
        return !input.matches("[1-5]");
    }
}
