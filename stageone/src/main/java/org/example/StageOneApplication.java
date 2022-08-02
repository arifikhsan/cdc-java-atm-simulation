package org.example;

import org.example.model.AccountModel;
import org.example.model.TransferModel;
import org.example.model.WithdrawModel;
import org.example.repository.CardRepository;
import org.example.screen.LoginScreen;
import org.example.screen.TransactionScreen;
import org.example.screen.contract.ScreenContract;
import org.example.screen.transfer.*;
import org.example.screen.withdraw.WithdrawCustomScreen;
import org.example.screen.withdraw.WithdrawScreen;
import org.example.screen.withdraw.WithdrawSummaryScreen;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StageOneApplication {
    public static Scanner scanner = new Scanner(System.in);
    public static AccountModel loggedInAccount = null;
    public static WithdrawModel withdrawModel = new WithdrawModel();
    public static TransferModel transferModel = new TransferModel();
    public static CardRepository cardRepository = new CardRepository();
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm a");

    public static void main(String[] args) {
        ScreenContract.welcome = new LoginScreen();
        ScreenContract.transaction = new TransactionScreen();
        ScreenContract.withdraw = new WithdrawScreen();
        ScreenContract.otherWithdraw = new WithdrawCustomScreen();
        ScreenContract.summaryWithdraw = new WithdrawSummaryScreen();
        ScreenContract.transferInputAccount = new TransferInputAccountScreen();
        ScreenContract.transferInputAmount = new TransferInputAmountScreen();
        ScreenContract.transferInputReference = new TransferInputReferenceScreen();
        ScreenContract.transferConfirmation = new TransferConfirmationScreen();
        ScreenContract.transferSummary = new TransferSummaryScreen();
        ScreenContract.currentScreen = ScreenContract.welcome;

        //noinspection InfiniteLoopStatement
        while (true) {
            ScreenContract.currentScreen.show();
        }
    }
}
