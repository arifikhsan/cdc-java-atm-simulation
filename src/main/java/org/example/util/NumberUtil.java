package org.example.util;

public class NumberUtil {
    public static boolean isNumber(String input) {
        return !input.matches("\\d+");
    }

    public static Integer generateRandomSixDigitNumber() {
        return (int) (Math.random() * 1000000);
    }
}
