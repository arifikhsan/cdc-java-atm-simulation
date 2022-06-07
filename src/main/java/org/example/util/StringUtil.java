package org.example.util;

public class StringUtil {
    public static boolean isExact6Digits(String input) {
        return input.matches("\\d{6}");
    }
}
