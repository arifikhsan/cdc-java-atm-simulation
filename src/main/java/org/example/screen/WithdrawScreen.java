package org.example.screen;

import org.example.model.Card;

import java.util.Scanner;

public class WithdrawScreen {
    private final Card currentUser;
    private final Scanner scanner = new Scanner(System.in);

    public WithdrawScreen(Card currentUser) {
        this.currentUser = currentUser;
    }

    public void show() {
        System.out.println("======================================");
        System.out.println("||            Withdraw              ||");
        System.out.println("======================================");
        System.out.println("Balance: USD " + currentUser.getBalance());
        System.out.println("======================================");
        System.out.println("Select Transaction [3]:");
        System.out.println("1. $10");
        System.out.println("2. $50");
        System.out.println("3. $100");
        System.out.println("4. Other");
        System.out.println("5. Back");
        System.out.println("======================================");
    }
}
