package org.example.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumberUtilTest {
    /**
     * Method under test: {@link NumberUtil#isAStringNumber(String)}
     */
    @Test
    void testIsAStringNumber() {
        assertFalse(NumberUtil.isAStringNumber("Input"));
        assertTrue(NumberUtil.isAStringNumber("9"));
        assertTrue(NumberUtil.isAStringNumber("42"));
        assertTrue(NumberUtil.isAStringNumber("99"));
        assertTrue(NumberUtil.isAStringNumber("942"));
        assertTrue(NumberUtil.isAStringNumber("429"));
        assertTrue(NumberUtil.isAStringNumber("4242"));
        assertTrue(NumberUtil.isAStringNumber("999"));
        assertTrue(NumberUtil.isAStringNumber("9942"));
        assertTrue(NumberUtil.isAStringNumber("9429"));
        assertTrue(NumberUtil.isAStringNumber("94242"));
        assertTrue(NumberUtil.isAStringNumber("424242"));
        assertTrue(NumberUtil.isAStringNumber("4299"));
        assertTrue(NumberUtil.isAStringNumber("42942"));
        assertTrue(NumberUtil.isAStringNumber("42429"));
    }

    /**
     * Method under test: {@link NumberUtil#generateRandomSixDigitNumber()}
     */
    @Test
    void testGenerateRandomSixDigitNumber() {
        var number = NumberUtil.generateRandomSixDigitNumber();
        assertTrue(number >= 100_000 && number <= 999_999);
    }

    /**
     * Method under test: {@link NumberUtil#isNegative(Integer)}
     */
    @Test
    void testIsNegative() {
        assertFalse(NumberUtil.isNegative(10));
        assertTrue(NumberUtil.isNegative(-1));
    }

    /**
     * Method under test: {@link NumberUtil#isPositive(Integer)}
     */
    @Test
    void testIsPositive() {
        assertTrue(NumberUtil.isPositive(10));
        assertFalse(NumberUtil.isPositive(0));
    }
}

