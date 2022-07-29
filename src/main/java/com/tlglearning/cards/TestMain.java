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

    //lambda statement
    deck.sort((card1, card2) -> {
      int comparison = card1.getRank().compareTo(card2.getRank());
      if (comparison == 0) {
        comparison = card1.getSuit().compareTo(card2.getSuit());
      }
      return comparison;
    });
    System.out.println(deck);
  }

}
