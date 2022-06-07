package org.example;

import org.example.model.TransferModel;
import org.example.repository.CardRepository;
import org.example.repository.TransferRepository;
import org.example.repository.WithdrawRepository;
import org.example.screen.WelcomeScreen;
import org.example.seeder.CardSeeder;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static final CardRepository cardRepository = new CardRepository(CardSeeder.seed(), null);
    public static WithdrawRepository withdrawRepository = new WithdrawRepository();
    public static final Scanner scanner = new Scanner(System.in);
    public static TransferModel transferModel;
    public static final TransferRepository transferRepository = new TransferRepository();
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm a");

    public static void main(String[] args) {

        new WelcomeScreen(cardRepository).showWelcomeScreen();
    }
}
