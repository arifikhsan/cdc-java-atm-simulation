package org.example.screen;

import org.example.model.CardModel;
import org.example.repository.CardRepository;

import static org.example.components.MessageComponent.println;
import static org.example.components.MessageComponent.showWithdrawSummaryScreenMessage;

public class WithdrawSummaryScreen {
    private final CardRepository cardRepository;

    public WithdrawSummaryScreen(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void showWithdrawSummaryScreen(CardModel loggedInCard) {
        while (true) {
            showWithdrawSummaryScreenMessage();
            showSummaryDetailMessage(loggedInCard);
        }
    }

    private void showSummaryDetailMessage(CardModel loggedInCard) {
        println("Your balance is " + loggedInCard.getBalance());
        println("Your card number is " + loggedInCard.getNumber());
        println("Your PIN is " + loggedInCard.getPin());
    }
}
