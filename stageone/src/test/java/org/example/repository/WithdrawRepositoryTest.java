package org.example.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.example.model.WithdrawModel;
import org.junit.jupiter.api.Test;

class WithdrawRepositoryTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link WithdrawRepository#WithdrawRepository()}
     *   <li>{@link WithdrawRepository#setWithdraws(List)}
     *   <li>{@link WithdrawRepository#getWithdraws()}
     * </ul>
     */
    @Test
    void testConstructor() {
        WithdrawRepository actualWithdrawRepository = new WithdrawRepository();
        ArrayList<WithdrawModel> withdrawModelList = new ArrayList<>();
        actualWithdrawRepository.setWithdraws(withdrawModelList);
        assertSame(withdrawModelList, actualWithdrawRepository.getWithdraws());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link WithdrawRepository#WithdrawRepository(List)}
     *   <li>{@link WithdrawRepository#setWithdraws(List)}
     *   <li>{@link WithdrawRepository#getWithdraws()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ArrayList<WithdrawModel> withdrawModelList = new ArrayList<>();
        WithdrawRepository actualWithdrawRepository = new WithdrawRepository(withdrawModelList);
        ArrayList<WithdrawModel> withdrawModelList1 = new ArrayList<>();
        actualWithdrawRepository.setWithdraws(withdrawModelList1);
        List<WithdrawModel> withdraws = actualWithdrawRepository.getWithdraws();
        assertSame(withdrawModelList1, withdraws);
        assertEquals(withdrawModelList, withdraws);
    }
}

