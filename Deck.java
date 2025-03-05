// Deck.java - Represents a deck of playing cards and provides various operations
import java.util.*;

public class Deck {
    private ArrayList<Card> cards; // List to store all the cards in the deck
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
    "Jack", "Queen", "King", "Ace"};

    // Constructor initializes the deck by calling the createDeck method
    public Deck() {
        createDeck();
    }

    // Creates a standard deck of 52 playing cards
    public void createDeck() {
        cards = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Prints all cards present in the deck
    public void printDeck() {
        for (Card card : cards) {
            card.printCard();
        }
    }

    // Shuffles the deck to randomize card order
    public void shuffleDeck() {
        Collections.shuffle(cards);
        System.out.println("Deck shuffled successfully.");
    }

    // Deals 5 random cards from the deck
    public void dealCard() {
        System.out.println("Dealing 5 random cards:");
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(cards.size());
            cards.get(index).printCard();
        }
    }

    // Searches for a specific card in the deck based on suit and rank
    public void findCard(String suit, String rank) {
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found: " + rank + " of " + suit);
                return;
            }
        }
        System.out.println("Card not found.");
    }
}

