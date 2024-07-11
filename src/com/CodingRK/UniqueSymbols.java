package com.CodingRK;

import java.util.*;

class Card {
    private String symbol;

    public Card(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

public class UniqueSymbols {
    public static void main(String[] args) {
        Set<Card> cardSet = new HashSet<>();

        // Adding some sample cards with symbols
        cardSet.add(new Card("♥"));
        cardSet.add(new Card("♦"));
        cardSet.add(new Card("♠"));
        cardSet.add(new Card("♥")); // Duplicate
        cardSet.add(new Card("♣"));

        Set<String> uniqueSymbols = new HashSet<>();
        for (Card card : cardSet) {
            uniqueSymbols.add(card.getSymbol());
        }

        System.out.println("Unique Symbols:");
        for (String symbol : uniqueSymbols) {
            System.out.println(symbol);
        }
    }
}
