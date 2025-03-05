// Card.java - Represents a playing card with suit and rank
public class Card {
    private String suit; // Suit of the card 
    private String rank; // Rank of the card 

    // Constructor to initialize a card with a suit and rank
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Method to retrieve the suit of the card
    public String getSuit() {
        return suit;
    }

    // Method to retrieve the rank of the card
    public String getRank() {
        return rank;
    }

    // Prints the card details
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }

    // Checks if another card has the same suit
    public boolean sameCard(Card other) {
        return this.suit.equals(other.suit);
    }

    // Checks if another card has the same rank
    public boolean compareCard(Card other) {
        return this.rank.equals(other.rank);
    }
}
