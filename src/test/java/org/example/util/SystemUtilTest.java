package org.example.util;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SystemUtilTest {
    /**
     * Method under test: {@link SystemUtil#println()}
     */
    @Test
    void testPrintln() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        SystemUtil.println();
    }

    /**
     * Method under test: {@link SystemUtil#println(String)}
     */
    @Test
    void testPrintln2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by println(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        SystemUtil.println("String");
    }

    /**
     * Method under test: {@link SystemUtil#print(String)}
     */
    @Test
    void testPrint() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by print(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        SystemUtil.print("String");
    }

    /**
     * Method under test: {@link SystemUtil#printEmptyLine()}
     */
    @Test
    void testPrintEmptyLine() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        SystemUtil.printEmptyLine();
    }

    /**
     * Method under test: {@link SystemUtil#printDoubleEmptyLine()}
     */
    @Test
    void testPrintDoubleEmptyLine() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        SystemUtil.printDoubleEmptyLine();
    }

    /**
     * Method under test: {@link SystemUtil#exitApp()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExitApp() {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to call 'System.exit'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        SystemUtil.exitApp();
    }

    /**
     * Method under test: {@link SystemUtil#exitConsoleApp()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExitConsoleApp() {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to call 'System.exit'.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        SystemUtil.exitConsoleApp();
    }
}

