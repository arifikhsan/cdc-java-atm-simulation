package org.example.util;

import static org.example.util.NumberUtil.isAStringNumber;

public class StringUtil {
    public static boolean isExact6Digits(String input) {
        return input.matches("\\d{6}");
    }

    public static boolean isValidAccountNumber(String account) {
        return !account.isEmpty() && isAStringNumber(account) && isExact6Digits(account);
    }
}
