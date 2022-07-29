package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import java.security.SecureRandom;
import java.util.Comparator;
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
    //method reference lambda
    deck.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
    System.out.println(deck);
  }

}
