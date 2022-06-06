package org.example.seeder;

import org.example.model.Card;

import java.util.List;

public class CardSeeder {
    public static List<Card> seed() {
        var card1 = new Card();
        card1.setName("John Doe");
        card1.setNumber("112233");
        card1.setPin("112233");
        card1.setBalance(100);

        var card2 = new Card();
        card2.setName("Jane Doe");
        card2.setNumber("112244");
        card2.setPin("112244");
        card2.setBalance(30);

        return List.of(card1, card2);
    }
}

// Name : John Doe
// PIN:012108
// Balance:$100
// Account Number:112233
//
// Name:Jane Doe
// PIN:932012
// Balance:$30
// Account Number: 112244
