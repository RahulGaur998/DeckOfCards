package com.deckofcards;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Welcome to Deck of Cards Program!");
        DeckOfCards deckOfCard = new DeckOfCards();
        deckOfCard.initiailzeDeck();
        deckOfCard.shuffleDeck();
        deckOfCard.distributeToPlayers();
        deckOfCard.printDistributedCardsToPlayers();
    }
}
