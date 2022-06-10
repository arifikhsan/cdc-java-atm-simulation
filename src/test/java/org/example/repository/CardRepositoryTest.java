package org.example.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.example.model.CardModel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CardRepositoryTest {
    /**
     * Method under test: {@link CardRepository#getCardByNumber(String)}
     */
    @Test
    void testGetCardByNumber() {
        assertNull((new CardRepository()).getCardByNumber("42"));
    }

    /**
     * Method under test: {@link CardRepository#getCardByNumber(String)}
     */
    @Test
    void testGetCardByNumber2() {
        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(new ArrayList<>());
        assertNull(cardRepository.getCardByNumber("foo"));
    }

    /**
     * Method under test: {@link CardRepository#getCardByNumber(String)}
     */
    @Test
    void testGetCardByNumber3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by getCardByNumber(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new CardRepository()).getCardByNumber("111111");
    }

    /**
     * Method under test: {@link CardRepository#getCardByNumber(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCardByNumber4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at org.example.repository.CardRepository.lambda$getCardByNumber$0(CardRepository.java:21)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //       at org.example.repository.CardRepository.getCardByNumber(CardRepository.java:22)
        //   In order to prevent getCardByNumber(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCardByNumber(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<CardModel> cardModelList = new ArrayList<>();
        cardModelList.add(new CardModel());

        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(cardModelList);
        cardRepository.getCardByNumber("foo");
    }

    /**
     * Method under test: {@link CardRepository#getCardByNumber(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCardByNumber5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.model.CardModel.getNumber()" because "card" is null
        //       at org.example.repository.CardRepository.lambda$getCardByNumber$0(CardRepository.java:21)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //       at org.example.repository.CardRepository.getCardByNumber(CardRepository.java:22)
        //   In order to prevent getCardByNumber(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCardByNumber(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<CardModel> cardModelList = new ArrayList<>();
        cardModelList.add(null);

        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(cardModelList);
        cardRepository.getCardByNumber("foo");
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumber(String)}
     */
    @Test
    void testIsExistByCardNumber() {
        assertFalse((new CardRepository()).isExistByCardNumber("42"));
        assertTrue((new CardRepository()).isExistByCardNumber("111111"));
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumber(String)}
     */
    @Test
    void testIsExistByCardNumber2() {
        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(new ArrayList<>());
        assertFalse(cardRepository.isExistByCardNumber("foo"));
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumber(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsExistByCardNumber3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at org.example.repository.CardRepository.lambda$isExistByCardNumber$1(CardRepository.java:27)
        //       at java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
        //       at java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.anyMatch(ReferencePipeline.java:632)
        //       at org.example.repository.CardRepository.isExistByCardNumber(CardRepository.java:27)
        //   In order to prevent isExistByCardNumber(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isExistByCardNumber(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<CardModel> cardModelList = new ArrayList<>();
        cardModelList.add(new CardModel());

        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(cardModelList);
        cardRepository.isExistByCardNumber("foo");
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumber(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsExistByCardNumber4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.model.CardModel.getNumber()" because "card" is null
        //       at org.example.repository.CardRepository.lambda$isExistByCardNumber$1(CardRepository.java:27)
        //       at java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
        //       at java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.anyMatch(ReferencePipeline.java:632)
        //       at org.example.repository.CardRepository.isExistByCardNumber(CardRepository.java:27)
        //   In order to prevent isExistByCardNumber(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isExistByCardNumber(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<CardModel> cardModelList = new ArrayList<>();
        cardModelList.add(null);

        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(cardModelList);
        cardRepository.isExistByCardNumber("foo");
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumberAndPin(String, String)}
     */
    @Test
    void testIsExistByCardNumberAndPin() {
        assertFalse((new CardRepository()).isExistByCardNumberAndPin("42", "Pin"));
        assertFalse((new CardRepository()).isExistByCardNumberAndPin("111111", "Pin"));
        assertTrue((new CardRepository()).isExistByCardNumberAndPin("111111", "111111"));
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumberAndPin(String, String)}
     */
    @Test
    void testIsExistByCardNumberAndPin2() {
        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(new ArrayList<>());
        assertFalse(cardRepository.isExistByCardNumberAndPin("foo", "foo"));
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumberAndPin(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsExistByCardNumberAndPin3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at org.example.repository.CardRepository.lambda$isExistByCardNumberAndPin$2(CardRepository.java:31)
        //       at java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
        //       at java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.anyMatch(ReferencePipeline.java:632)
        //       at org.example.repository.CardRepository.isExistByCardNumberAndPin(CardRepository.java:31)
        //   In order to prevent isExistByCardNumberAndPin(String, String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isExistByCardNumberAndPin(String, String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<CardModel> cardModelList = new ArrayList<>();
        cardModelList.add(new CardModel());

        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(cardModelList);
        cardRepository.isExistByCardNumberAndPin("foo", "foo");
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumberAndPin(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsExistByCardNumberAndPin4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.model.CardModel.getNumber()" because "card" is null
        //       at org.example.repository.CardRepository.lambda$isExistByCardNumberAndPin$2(CardRepository.java:31)
        //       at java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
        //       at java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.anyMatch(ReferencePipeline.java:632)
        //       at org.example.repository.CardRepository.isExistByCardNumberAndPin(CardRepository.java:31)
        //   In order to prevent isExistByCardNumberAndPin(String, String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isExistByCardNumberAndPin(String, String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<CardModel> cardModelList = new ArrayList<>();
        cardModelList.add(null);

        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(cardModelList);
        cardRepository.isExistByCardNumberAndPin("foo", "foo");
    }

    /**
     * Method under test: {@link CardRepository#isExistByCardNumberAndPin(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsExistByCardNumberAndPin5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at org.example.repository.CardRepository.lambda$isExistByCardNumberAndPin$2(CardRepository.java:31)
        //       at java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
        //       at java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
        //       at java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.anyMatch(ReferencePipeline.java:632)
        //       at org.example.repository.CardRepository.isExistByCardNumberAndPin(CardRepository.java:31)
        //   In order to prevent isExistByCardNumberAndPin(String, String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isExistByCardNumberAndPin(String, String).
        //   See https://diff.blue/R013 to resolve this issue.

        CardModel cardModel = new CardModel();
        cardModel.setNumber("42");

        ArrayList<CardModel> cardModelList = new ArrayList<>();
        cardModelList.add(cardModel);

        CardRepository cardRepository = new CardRepository();
        cardRepository.setCards(cardModelList);
        cardRepository.isExistByCardNumberAndPin("42", "foo");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link CardRepository}
     *   <li>{@link CardRepository#setCards(List)}
     *   <li>{@link CardRepository#getCards()}
     * </ul>
     */
    @Test
    void testConstructor() {
        CardRepository actualCardRepository = new CardRepository();
        ArrayList<CardModel> cardModelList = new ArrayList<>();
        actualCardRepository.setCards(cardModelList);
        assertSame(cardModelList, actualCardRepository.getCards());
    }
}

