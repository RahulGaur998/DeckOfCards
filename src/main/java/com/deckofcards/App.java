package com.deckofcards;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Welcome to Deck of Cards Program!");
        DeckOfCards deckOfCard = new DeckOfCards();
        Scanner scannerObject = new Scanner(System.in);
        int numberOfPlayers = Integer.parseInt(scannerObject.nextLine());
        Queue[] player = new Queue[4];
        for (int i = 0; i < numberOfPlayers; i++) {
            player[i] = new Queue();
        }
        deckOfCard.initiailzeDeck();
        deckOfCard.shuffleDeck();
        for (int i = 0; i < numberOfPlayers; i++) {
            deckOfCard.distributeToPlayers(player[i]);
        }
        // deckOfCard.printDistributedCardsToPlayers();
        for (int i = 0; i < numberOfPlayers; i++) {
            player[i].display();
        }
        scannerObject.close();
    }
}
