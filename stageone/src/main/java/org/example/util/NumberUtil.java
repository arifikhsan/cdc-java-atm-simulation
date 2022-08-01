package org.example.util;

public class NumberUtil {
    public static boolean isAStringNumber(String input) {
        return input.matches("\\d+");
    }

    public static Integer generateRandomSixDigitNumber() {
        return (int) (Math.random() * 1_000_000);
    }

    public static boolean isNegative(Integer number) {
        return number < 0;
    }

    public static boolean isPositive(Integer number) {
        return number > 0;
    }

    public static boolean isGreaterThanNumber(Integer number, Integer compareTo) {
        return number > compareTo;
    }

    public static boolean isMultiplyOfNumber(Integer number, Integer multiplyBy) {
        return number % multiplyBy == 0;
    }
}
