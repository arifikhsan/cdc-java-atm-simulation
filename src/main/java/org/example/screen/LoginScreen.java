package org.example.screen;

import org.example.exception.NotFoundException;
import org.example.model.CardModel;
import org.example.repository.CardRepository;

import java.util.Scanner;

import static org.example.components.MessageComponent.*;

public class LoginScreen {
    private final CardRepository cardRepository;
    private final Scanner scanner = new Scanner(System.in);

    public LoginScreen(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void showLoginScreen() {
        String cardNumber;
        String pin;
        CardModel currentCard;

        while (true) {
            showLoginScreenMessage();

            print("Enter your card number: ");
            cardNumber = scanner.nextLine();
            println("Your card number is " + cardNumber);

            print("Enter your PIN: ");
            pin = scanner.nextLine();
            println("Your PIN is " + pin);

            try {
                currentCard = login(cardNumber, pin);
                showSuccessMessage("Welcome, " + currentCard.getName());
                gotoTransactionScreen(currentCard);
                return;
            } catch (NotFoundException e) {
                showErrorMessage("Login failed. Please try again.");
            }
        }
    }

    public void gotoTransactionScreen(CardModel currentCard) {
        cardRepository.setLoggedInCard(currentCard);
        new TransactionScreen(cardRepository).showTransactionScreen();
    }

    public CardModel login(String cardNumber, String pin) throws NotFoundException {
        return cardRepository.getCards().stream()
                .filter(card -> card.getNumber().equals(cardNumber) && card.getPin().equals(pin))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}
