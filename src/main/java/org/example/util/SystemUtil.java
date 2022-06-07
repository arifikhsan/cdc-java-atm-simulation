package org.example.util;

import static org.example.components.MessageComponent.showGoodByeMessage;

public class SystemUtil {
    public static void println(String string) {
        System.out.println(string);
    }

    public static void print(String string) {
        System.out.print(string);
    }

    public static void println() {
        System.out.println();
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void exitApp() {
        showGoodByeMessage();
        exitConsoleApp();
    }

    public static void exitConsoleApp() {
        System.exit(0);
    }
}
