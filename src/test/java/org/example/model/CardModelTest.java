package org.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CardModelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CardModel#CardModel()}
     *   <li>{@link CardModel#setBalance(Integer)}
     *   <li>{@link CardModel#setName(String)}
     *   <li>{@link CardModel#setNumber(String)}
     *   <li>{@link CardModel#setPin(String)}
     *   <li>{@link CardModel#getBalance()}
     *   <li>{@link CardModel#getName()}
     *   <li>{@link CardModel#getNumber()}
     *   <li>{@link CardModel#getPin()}
     * </ul>
     */
    @Test
    void testConstructor() {
        CardModel actualCardModel = new CardModel();
        actualCardModel.setBalance(1);
        actualCardModel.setName("Name");
        actualCardModel.setNumber("42");
        actualCardModel.setPin("Pin");
        assertEquals(1, actualCardModel.getBalance().intValue());
        assertEquals("Name", actualCardModel.getName());
        assertEquals("42", actualCardModel.getNumber());
        assertEquals("Pin", actualCardModel.getPin());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CardModel#CardModel(String, String, String, Integer)}
     *   <li>{@link CardModel#setBalance(Integer)}
     *   <li>{@link CardModel#setName(String)}
     *   <li>{@link CardModel#setNumber(String)}
     *   <li>{@link CardModel#setPin(String)}
     *   <li>{@link CardModel#getBalance()}
     *   <li>{@link CardModel#getName()}
     *   <li>{@link CardModel#getNumber()}
     *   <li>{@link CardModel#getPin()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        CardModel actualCardModel = new CardModel("Name", "42", "Pin", 1);
        actualCardModel.setBalance(1);
        actualCardModel.setName("Name");
        actualCardModel.setNumber("42");
        actualCardModel.setPin("Pin");
        assertEquals(1, actualCardModel.getBalance().intValue());
        assertEquals("Name", actualCardModel.getName());
        assertEquals("42", actualCardModel.getNumber());
        assertEquals("Pin", actualCardModel.getPin());
    }
}

