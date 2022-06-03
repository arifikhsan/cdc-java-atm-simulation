package org.example.screen;

import org.example.model.Card;

import java.util.Scanner;

public class TransactionScreen {
    private final Card currentUser;
    private final Scanner scanner = new Scanner(System.in);

    public TransactionScreen(Card currentUser) {
        this.currentUser = currentUser;
    }

    public String show() {
        System.out.println("======================================");
        System.out.println("||            Very Good ATM         ||");
        System.out.println("======================================");
        System.out.println("Name: " + currentUser.getName());
        System.out.println("Account Number: " + currentUser.getNumber());
        System.out.println("Balance: USD " + currentUser.getBalance());
        System.out.println("======================================");
        System.out.println("Select Transaction [3]:");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Transfer Money");
        System.out.println("3. Logout");
        System.out.println("4. Exit ATM");
        System.out.println("======================================");

        while (true) {
            System.out.print("Select Transaction: ");
            switch (scanner.nextInt()) {
                case 1 -> withdrawMoney();
                case 2 -> transferMoney();
                case 3 -> {
                    System.out.println("Thank you!");
                    return "logout";
                }
                case 4 -> {
                    System.out.println("Thank you!");
                    return "exit";
                }
                default -> {
                    System.out.println("Invalid transaction!");
                }
            }
        }
    }

    public void withdrawMoney() {
        System.out.println("withdraw money");
    }

    public void transferMoney() {
        System.out.println("transfer money");
    }
}

//1. Withdraw
//2. Fund Transfer
//3. Exit
//Please choose option[3]:
