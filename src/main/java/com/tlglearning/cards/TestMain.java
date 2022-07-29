package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.strategy.RankFirstComparator;
import java.security.SecureRandom;
import java.util.Random;
import com.tlglearning.cards.model.Deck;

public class TestMain {

  public static void main(String[] args) {
    Deck deck = new Deck();
    Random rng = new SecureRandom();
    System.out.println(deck);

    // shuffle deck
    deck.shuffle(rng);
    System.out.println(deck);
//    for (Card card : deck) {
//      System.out.println(card);
//    }
    // sort back in order
    deck.sort();
    System.out.println(deck);

    deck.sort(new RankFirstComparator());
    System.out.println(deck);
  }
}
