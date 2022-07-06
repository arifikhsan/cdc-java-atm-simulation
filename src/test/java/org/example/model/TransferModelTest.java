package org.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TransferModelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TransferModel#TransferModel()}
     *   <li>{@link TransferModel#setAmount(Integer)}
     *   <li>{@link TransferModel#setDateTime(LocalDateTime)}
     *   <li>{@link TransferModel#setFromCard(AccountModel)}
     *   <li>{@link TransferModel#setReference(Integer)}
     *   <li>{@link TransferModel#setToCard(AccountModel)}
     *   <li>{@link TransferModel#getAmount()}
     *   <li>{@link TransferModel#getDateTime()}
     *   <li>{@link TransferModel#getFromCard()}
     *   <li>{@link TransferModel#getReference()}
     *   <li>{@link TransferModel#getToCard()}
     * </ul>
     */
    @Test
    void testConstructor() {
        TransferModel actualTransferModel = new TransferModel();
        actualTransferModel.setAmount(10);
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualTransferModel.setDateTime(ofResult);
        AccountModel accountModel = new AccountModel();
        actualTransferModel.setFromCard(accountModel);
        actualTransferModel.setReference(1);
        AccountModel accountModel1 = new AccountModel();
        actualTransferModel.setToCard(accountModel1);
        assertEquals(10, actualTransferModel.getAmount().intValue());
        assertSame(ofResult, actualTransferModel.getDateTime());
        assertSame(accountModel, actualTransferModel.getFromCard());
        assertEquals(1, actualTransferModel.getReference().intValue());
        assertSame(accountModel1, actualTransferModel.getToCard());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TransferModel#TransferModel(AccountModel, AccountModel, Integer, LocalDateTime, Integer)}
     *   <li>{@link TransferModel#setAmount(Integer)}
     *   <li>{@link TransferModel#setDateTime(LocalDateTime)}
     *   <li>{@link TransferModel#setFromCard(AccountModel)}
     *   <li>{@link TransferModel#setReference(Integer)}
     *   <li>{@link TransferModel#setToCard(AccountModel)}
     *   <li>{@link TransferModel#getAmount()}
     *   <li>{@link TransferModel#getDateTime()}
     *   <li>{@link TransferModel#getFromCard()}
     *   <li>{@link TransferModel#getReference()}
     *   <li>{@link TransferModel#getToCard()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        AccountModel fromCard = new AccountModel();
        AccountModel toCard = new AccountModel();
        TransferModel actualTransferModel = new TransferModel(fromCard, toCard, 10, LocalDateTime.of(1, 1, 1, 1, 1), 1);
        actualTransferModel.setAmount(10);
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualTransferModel.setDateTime(ofResult);
        AccountModel accountModel = new AccountModel();
        actualTransferModel.setFromCard(accountModel);
        actualTransferModel.setReference(1);
        AccountModel accountModel1 = new AccountModel();
        actualTransferModel.setToCard(accountModel1);
        assertEquals(10, actualTransferModel.getAmount().intValue());
        assertSame(ofResult, actualTransferModel.getDateTime());
        assertSame(accountModel, actualTransferModel.getFromCard());
        assertEquals(1, actualTransferModel.getReference().intValue());
        assertSame(accountModel1, actualTransferModel.getToCard());
    }
}

