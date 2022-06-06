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

    public void showWithdrawSummaryScreen() {
//        while (true) {
            showWithdrawSummaryScreenMessage();
            showSummaryDetailMessage();
//        }
    }

    private void showSummaryDetailMessage() {
        println("Your balance is " + cardRepository.getLoggedInCard().getBalance());
        println("Your card number is " + cardRepository.getLoggedInCard().getNumber());
        println("Your PIN is " + cardRepository.getLoggedInCard().getPin());
    }
}
