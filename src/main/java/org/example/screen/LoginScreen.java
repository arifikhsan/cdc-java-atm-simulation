package org.example.screen;

import org.example.exception.NotFoundException;
import org.example.model.Card;
import org.example.seeder.CardSeeder;

import java.util.Scanner;
import java.util.Set;

import static org.example.components.MessageComponent.showWelcome;

public class LoginScreen {
    private final Set<Card> cards = CardSeeder.seed();
    private final Scanner scanner = new Scanner(System.in);
    private String cardNumber;
    private String pin;

    public Card show() {
        Card foundCard;
        while (true) {
            showWelcome();

            System.out.print("Enter your card number: ");
            cardNumber = scanner.nextLine();
            System.out.println("Your card number is " + cardNumber);

            System.out.print("Enter your PIN: ");
            pin = scanner.nextLine();
            System.out.println("Your PIN is " + pin);

            try {
                foundCard = login(cardNumber, pin);
                System.out.println("======================================");
                System.out.println("Welcome, " + foundCard.getName());
                System.out.println("======================================");
                break;
            } catch (NotFoundException e) {
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("Login failed. Try again");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
        }

        return foundCard;
    }

    public Card login(String cardNumber, String pin) throws NotFoundException {
        return cards.stream()
                .filter(card -> card.getNumber().equals(cardNumber) && card.getPin().equals(pin))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}
