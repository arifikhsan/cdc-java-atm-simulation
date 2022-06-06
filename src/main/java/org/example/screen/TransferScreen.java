package org.example.screen;

import org.example.model.CardModel;

import java.util.List;
import java.util.Scanner;

import static org.example.components.MessageComponent.showTransferScreenMessage;

public class TransferScreen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showTransferScreen(CardModel currentCard, List<CardModel> cards) {
        showTransferScreenMessage();
    }
}
