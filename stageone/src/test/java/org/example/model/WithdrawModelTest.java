package org.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class WithdrawModelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link WithdrawModel#WithdrawModel()}
     *   <li>{@link WithdrawModel#setAmount(Integer)}
     *   <li>{@link WithdrawModel#setBalance(Integer)}
     *   <li>{@link WithdrawModel#setCard(AccountModel)}
     *   <li>{@link WithdrawModel#setDatetime(LocalDateTime)}
     *   <li>{@link WithdrawModel#getAmount()}
     *   <li>{@link WithdrawModel#getBalance()}
     *   <li>{@link WithdrawModel#getCard()}
     *   <li>{@link WithdrawModel#getDatetime()}
     * </ul>
     */
    @Test
    void testConstructor() {
        WithdrawModel actualWithdrawModel = new WithdrawModel();
        actualWithdrawModel.setAmount(10);
        actualWithdrawModel.setBalance(1);
        AccountModel accountModel = new AccountModel();
        actualWithdrawModel.setCard(accountModel);
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualWithdrawModel.setDatetime(ofResult);
        assertEquals(10, actualWithdrawModel.getAmount().intValue());
        assertEquals(1, actualWithdrawModel.getBalance().intValue());
        assertSame(accountModel, actualWithdrawModel.getCard());
        assertSame(ofResult, actualWithdrawModel.getDatetime());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link WithdrawModel#WithdrawModel(LocalDateTime, Integer, Integer, AccountModel)}
     *   <li>{@link WithdrawModel#setAmount(Integer)}
     *   <li>{@link WithdrawModel#setBalance(Integer)}
     *   <li>{@link WithdrawModel#setCard(AccountModel)}
     *   <li>{@link WithdrawModel#setDatetime(LocalDateTime)}
     *   <li>{@link WithdrawModel#getAmount()}
     *   <li>{@link WithdrawModel#getBalance()}
     *   <li>{@link WithdrawModel#getCard()}
     *   <li>{@link WithdrawModel#getDatetime()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        LocalDateTime datetime = LocalDateTime.of(1, 1, 1, 1, 1);
        WithdrawModel actualWithdrawModel = new WithdrawModel(datetime, 10, 1, new AccountModel());
        actualWithdrawModel.setAmount(10);
        actualWithdrawModel.setBalance(1);
        AccountModel accountModel = new AccountModel();
        actualWithdrawModel.setCard(accountModel);
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualWithdrawModel.setDatetime(ofResult);
        assertEquals(10, actualWithdrawModel.getAmount().intValue());
        assertEquals(1, actualWithdrawModel.getBalance().intValue());
        assertSame(accountModel, actualWithdrawModel.getCard());
        assertSame(ofResult, actualWithdrawModel.getDatetime());
    }
}

