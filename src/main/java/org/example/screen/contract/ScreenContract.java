package org.example.screen.contract;

public abstract class ScreenContract {
    public static ScreenContract currentScreen;
    public static ScreenContract welcome, transaction, withdraw, otherWithdraw, summaryWithdraw, transferInputAccount, transferInputAmount, transferInputReference, transferConfirmation, transferSummary;

    public void show() {};
}
