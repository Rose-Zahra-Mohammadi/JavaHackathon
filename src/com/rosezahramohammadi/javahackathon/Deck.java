package com.rosezahramohammadi.javahackathon;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cards;
	
 public Deck() {
     this.cards = new ArrayList<Card>();

     // Populate the cards list -- loop to 52
     for (String name : new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}) {
         for (Integer rank = 1; rank <= 13; rank++) {
             this.cards.add(new Card(name, rank));
         }
     }
 }

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	 public Card removeCards() {
		 Random rand = new Random();
		 return cards.remove(rand.nextInt(cards.size()));
	 }
}