package org.example.screen;

import org.example.model.Card;

import java.util.List;
import java.util.Scanner;

import static org.example.components.MessageComponent.showTransferScreenMessage;

public class TransferScreen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showTransferScreen(Card currentCard, List<Card> cards) {
        showTransferScreenMessage();
    }
}
