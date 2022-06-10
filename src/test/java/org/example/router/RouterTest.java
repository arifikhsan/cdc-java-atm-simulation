package org.example.router;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class RouterTest {
    /**
     * Method under test: {@link Router#gotoWelcomeScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoWelcomeScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: end
        //       at java.util.regex.Matcher.region(Matcher.java:1514)
        //       at java.util.Scanner.findPatternInBuffer(Scanner.java:1089)
        //       at java.util.Scanner.findWithinHorizon(Scanner.java:1791)
        //       at java.util.Scanner.nextLine(Scanner.java:1649)
        //       at org.example.screen.WelcomeScreen.show(WelcomeScreen.java:22)
        //       at org.example.router.Router.gotoWelcomeScreen(Router.java:13)
        //   In order to prevent gotoWelcomeScreen()
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoWelcomeScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoWelcomeScreen();
    }

    /**
     * Method under test: {@link Router#gotoTransactionScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoTransactionScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.model.CardModel.getName()" because "org.example.Main.loggedInCard" is null
        //       at org.example.screen.TransactionScreen.showUserInfo(TransactionScreen.java:57)
        //       at org.example.screen.TransactionScreen.show(TransactionScreen.java:18)
        //       at org.example.router.Router.gotoTransactionScreen(Router.java:17)
        //   In order to prevent gotoTransactionScreen()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoTransactionScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoTransactionScreen();
    }

    /**
     * Method under test: {@link Router#gotoLoginScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoLoginScreen() {
        // TODO: Complete this test.
        //   Reason: R010 Timeout.
        //   Creating the arrange/act section of your test took more than
        //   20 seconds. This often happens because Diffblue Cover ran code in your
        //   project which requests user input (System.in), blocks on a lock, or runs into
        //   an infinite or very long loop.
        //   See https://diff.blue/R010 to resolve this issue.

        // Arrange and Act
        // TODO: Populate arranged inputs
        Router.gotoLoginScreen();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Router#gotoWithdrawScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoWithdrawScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.model.CardModel.getBalance()" because "org.example.Main.loggedInCard" is null
        //       at org.example.screen.withdraw.WithdrawScreen.showBalanceMessage(WithdrawScreen.java:71)
        //       at org.example.screen.withdraw.WithdrawScreen.show(WithdrawScreen.java:20)
        //       at org.example.router.Router.gotoWithdrawScreen(Router.java:25)
        //   In order to prevent gotoWithdrawScreen()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoWithdrawScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoWithdrawScreen();
    }

    /**
     * Method under test: {@link Router#gotoTransferScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoTransferScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: end
        //       at java.util.regex.Matcher.region(Matcher.java:1514)
        //       at java.util.Scanner.findPatternInBuffer(Scanner.java:1089)
        //       at java.util.Scanner.findWithinHorizon(Scanner.java:1791)
        //       at java.util.Scanner.nextLine(Scanner.java:1649)
        //       at org.example.screen.transfer.TransferInputAccountScreen.show(TransferInputAccountScreen.java:20)
        //       at org.example.router.Router.gotoTransferScreen(Router.java:29)
        //   In order to prevent gotoTransferScreen()
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoTransferScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoTransferScreen();
    }

    /**
     * Method under test: {@link Router#gotoWithdrawCustomScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoWithdrawCustomScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: end
        //       at java.util.regex.Matcher.region(Matcher.java:1514)
        //       at java.util.Scanner.findPatternInBuffer(Scanner.java:1089)
        //       at java.util.Scanner.findWithinHorizon(Scanner.java:1791)
        //       at java.util.Scanner.nextLine(Scanner.java:1649)
        //       at org.example.screen.withdraw.WithdrawCustomScreen.show(WithdrawCustomScreen.java:25)
        //       at org.example.router.Router.gotoWithdrawCustomScreen(Router.java:33)
        //   In order to prevent gotoWithdrawCustomScreen()
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoWithdrawCustomScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoWithdrawCustomScreen();
    }

    /**
     * Method under test: {@link Router#gotoWithdrawSummaryScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoWithdrawSummaryScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)" because the return value of "org.example.model.WithdrawModel.getDatetime()" is null
        //       at org.example.screen.withdraw.WithdrawSummaryScreen.showSummaryDetailMessage(WithdrawSummaryScreen.java:38)
        //       at org.example.screen.withdraw.WithdrawSummaryScreen.show(WithdrawSummaryScreen.java:15)
        //       at org.example.router.Router.gotoWithdrawSummaryScreen(Router.java:37)
        //   In order to prevent gotoWithdrawSummaryScreen()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoWithdrawSummaryScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoWithdrawSummaryScreen();
    }

    /**
     * Method under test: {@link Router#gotoSummaryScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoSummaryScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.model.CardModel.getNumber()" because the return value of "org.example.model.TransferModel.getToCard()" is null
        //       at org.example.screen.transfer.TransferSummaryScreen.showSummary(TransferSummaryScreen.java:57)
        //       at org.example.screen.transfer.TransferSummaryScreen.show(TransferSummaryScreen.java:17)
        //       at org.example.router.Router.gotoSummaryScreen(Router.java:41)
        //   In order to prevent gotoSummaryScreen()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoSummaryScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoSummaryScreen();
    }

    /**
     * Method under test: {@link Router#gotoTransferInputAmountScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoTransferInputAmountScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: end
        //       at java.util.regex.Matcher.region(Matcher.java:1514)
        //       at java.util.Scanner.findPatternInBuffer(Scanner.java:1089)
        //       at java.util.Scanner.findWithinHorizon(Scanner.java:1791)
        //       at java.util.Scanner.nextLine(Scanner.java:1649)
        //       at org.example.screen.transfer.TransferInputAmountScreen.show(TransferInputAmountScreen.java:21)
        //       at org.example.router.Router.gotoTransferInputAmountScreen(Router.java:45)
        //   In order to prevent gotoTransferInputAmountScreen()
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoTransferInputAmountScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoTransferInputAmountScreen();
    }

    /**
     * Method under test: {@link Router#gotoTransferInputReferenceString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoTransferInputReferenceString() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: end
        //       at java.util.regex.Matcher.region(Matcher.java:1514)
        //       at java.util.Scanner.findPatternInBuffer(Scanner.java:1089)
        //       at java.util.Scanner.findWithinHorizon(Scanner.java:1791)
        //       at java.util.Scanner.nextLine(Scanner.java:1649)
        //       at org.example.screen.transfer.TransferInputReferenceScreen.show(TransferInputReferenceScreen.java:27)
        //       at org.example.router.Router.gotoTransferInputReferenceString(Router.java:49)
        //   In order to prevent gotoTransferInputReferenceString()
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoTransferInputReferenceString().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoTransferInputReferenceString();
    }

    /**
     * Method under test: {@link Router#gotoTransferConfirmationScreen()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGotoTransferConfirmationScreen() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.model.CardModel.getNumber()" because the return value of "org.example.model.TransferModel.getToCard()" is null
        //       at org.example.screen.transfer.TransferConfirmationScreen.showSummary(TransferConfirmationScreen.java:66)
        //       at org.example.screen.transfer.TransferConfirmationScreen.show(TransferConfirmationScreen.java:18)
        //       at org.example.router.Router.gotoTransferConfirmationScreen(Router.java:53)
        //   In order to prevent gotoTransferConfirmationScreen()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   gotoTransferConfirmationScreen().
        //   See https://diff.blue/R013 to resolve this issue.

        Router.gotoTransferConfirmationScreen();
    }
}

