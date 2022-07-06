package org.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AccountModelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AccountModel#AccountModel()}
     *   <li>{@link AccountModel#setBalance(Integer)}
     *   <li>{@link AccountModel#setName(String)}
     *   <li>{@link AccountModel#setNumber(String)}
     *   <li>{@link AccountModel#setPin(String)}
     *   <li>{@link AccountModel#getBalance()}
     *   <li>{@link AccountModel#getName()}
     *   <li>{@link AccountModel#getNumber()}
     *   <li>{@link AccountModel#getPin()}
     * </ul>
     */
    @Test
    void testConstructor() {
        AccountModel actualAccountModel = new AccountModel();
        actualAccountModel.setBalance(1);
        actualAccountModel.setName("Name");
        actualAccountModel.setNumber("42");
        actualAccountModel.setPin("Pin");
        assertEquals(1, actualAccountModel.getBalance().intValue());
        assertEquals("Name", actualAccountModel.getName());
        assertEquals("42", actualAccountModel.getNumber());
        assertEquals("Pin", actualAccountModel.getPin());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AccountModel#AccountModel(String, String, String, Integer)}
     *   <li>{@link AccountModel#setBalance(Integer)}
     *   <li>{@link AccountModel#setName(String)}
     *   <li>{@link AccountModel#setNumber(String)}
     *   <li>{@link AccountModel#setPin(String)}
     *   <li>{@link AccountModel#getBalance()}
     *   <li>{@link AccountModel#getName()}
     *   <li>{@link AccountModel#getNumber()}
     *   <li>{@link AccountModel#getPin()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        AccountModel actualAccountModel = new AccountModel("Name", "42", "Pin", 1);
        actualAccountModel.setBalance(1);
        actualAccountModel.setName("Name");
        actualAccountModel.setNumber("42");
        actualAccountModel.setPin("Pin");
        assertEquals(1, actualAccountModel.getBalance().intValue());
        assertEquals("Name", actualAccountModel.getName());
        assertEquals("42", actualAccountModel.getNumber());
        assertEquals("Pin", actualAccountModel.getPin());
    }
}

