package org.example.screen;

import static java.lang.Integer.parseInt;
import static org.example.Main.scanner;
import static org.example.components.MessageComponent.*;
import static org.example.router.Router.gotoLoginScreen;
import static org.example.util.NumberUtil.isAStringNumber;
import static org.example.util.NumberUtil.isPositive;
import static org.example.util.SystemUtil.*;

public class WelcomeScreen {
    public void show() {
        //noinspection InfiniteLoopStatement
        while (true) {
            printWelcomeMessage();
            showOptionsMessage();

            var option = scanner.nextLine();

            if (option.isEmpty()) option = "3";

            if (isValidOption(option)) {
                showInvalidOptionMessage(option);
                continue;
            }

            switch (parseInt(option)) {
                case 1: {
                    gotoLoginScreen();
                    continue;
                }
                case 2: {
                    exitApp();
                }
                case 3:
                    continue;
                default:
                    showInvalidOptionMessage(option);
            }
        }
    }

    private Boolean isValidOption(String input) {
        return isAStringNumber(input) && isPositive(parseInt(input)) && !isIncludedInOption(input);
    }

    private boolean isIncludedInOption(String option) {
        return option.matches("[1-3]");
    }

    private void showOptionsMessage() {
        printHorizontalLine();
        println("Choice:");
        println("1. Login");
        println("2. Exit");
        println("3. Do nothing");
        printHorizontalLine();
        print("Please enter your option [3]: ");
    }
}
