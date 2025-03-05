# Card_Deck_Java-
# Card Deck Implementation in Java

## Overview
This project is a **menu-driven Java program** that simulates a standard deck of 52 playing cards. The program allows users to perform various operations on the deck, such as creating, shuffling, dealing, searching, and comparing cards. The implementation follows **object-oriented principles**, utilizing separate Java files for different functionalities to ensure modularity and maintainability.

## Features & Methods
The program is structured into three main classes:

### 1. `Card.java`
This class represents a **single playing card** with:
- `printCard()`: Displays the card in a user-friendly format.
- `sameCard(Card other)`: Checks if two cards have the same suit.
- `compareCard(Card other)`: Checks if two cards have the same rank.

### 2. `Deck.java`
This class manages a **deck of 52 cards**, implementing:
- `createDeck()`: Initializes a new deck of 52 cards (also used in the constructor).
- `printDeck()`: Displays all cards in the deck.
- `shuffleDeck()`: Randomizes the deck.
- `dealCard()`: Deals 5 random cards.
- `findCard(String suit, String rank)`: Searches for a specific card in the deck.

### 3. `Main.java`
This class contains the **menu-driven interface** for user interaction:
- Provides options to print, shuffle, deal, and search cards.
- Uses `Scanner` for user input and handles invalid choices gracefully.

## Implementation Details
- **Uses `ArrayList`** to store deck objects for dynamic resizing and efficient operations.
- **Encapsulated design**: Each class has its own responsibilities, promoting reusability.
- **Follows Java coding standards**, ensuring clarity and maintainability.
- **Commented code** to explain logic and enhance readability.

## How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/Card_Deck_Java.git
