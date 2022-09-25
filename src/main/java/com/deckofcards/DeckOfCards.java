package com.deckofcards;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeckOfCards {
    private static final Logger logger = LogManager.getLogger(App.class);
    String[] SUITS = { "CLUBS", "DIAMOND", "HEARTS", "SPADES" };
    String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    private String[] decks = new String[52];

    public void initiailzeDeck() { // deck initiaization as 2CLUBS - 3CLUBS and so on % gives rank as 2,3,4,5,6,...
                                   // / gives CLUBS first till 13 then DIAMOND and so on
        for (int i = 0; i < decks.length; i++) {
            decks[i] = RANKS[i % 13] + SUITS[i / 13];
            logger.info(decks[i]);// print each value entered in deck
        }
    }

}