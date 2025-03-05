// Name: Sehajdeep Singh Sikka 
// PRN: 23070126119
// Batch: Class of 2027 | AIML B2
// Main.java - Provides a menu-driven interface for interacting with the deck
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck(); // Create a deck object

        // Used to display menu and perform operations 
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Deal 5 Cards");
            System.out.println("4. Find a Card");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    deck.printDeck(); // Display all cards in the deck
                    break;
                case 2:
                    deck.shuffleDeck(); // Shuffle the deck
                    break;
                case 3:
                    deck.dealCard(); // Deal 5 random cards
                    break;
                case 4:
                    System.out.print("Enter suit: ");
                    String suit = scanner.nextLine();
                    System.out.print("Enter rank: ");
                    String rank = scanner.nextLine();
                    deck.findCard(suit, rank); // Search for a specific card
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

