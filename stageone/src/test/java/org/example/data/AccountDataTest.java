package org.example.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.example.model.AccountModel;
import org.junit.jupiter.api.Test;

class AccountDataTest {
    /**
     * Method under test: {@link AccountData#getAllAccounts()}
     */
    @Test
    void testGetAllCards() {
        List<AccountModel> actualAllCards = AccountData.getAllAccounts();
        assertEquals(2, actualAllCards.size());
        AccountModel getResult = actualAllCards.get(0);
        assertEquals("111111", getResult.getPin());
        AccountModel getResult1 = actualAllCards.get(1);
        assertEquals("222222", getResult1.getPin());
        assertEquals("222222", getResult1.getNumber());
        assertEquals("Jane Doe", getResult1.getName());
        assertEquals(30, getResult1.getBalance().intValue());
        assertEquals("111111", getResult.getNumber());
        assertEquals("John Doe", getResult.getName());
        assertEquals(100, getResult.getBalance().intValue());
    }
}

