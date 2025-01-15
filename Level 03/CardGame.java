import java.util.*;

public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = i + rand.nextInt(deck.length - i);
            // Swap the cards
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
        return deck;
    }

    // Method to distribute the deck to players
    public static String[][] distributeDeck(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Deck cannot be evenly distributed among players.");
            return new String[0][0];
        }

        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];
        int cardIndex = 0;

        // Distribute cards to players
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize the deck of cards
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Number of cards to distribute and number of players
        int numOfCards = deck.length;
        int numOfPlayers = 4; // You can change this number as needed
        
        // Distribute the cards to players
        String[][] players = distributeDeck(deck, numOfCards, numOfPlayers);
        
        // Print the cards of each player
        printPlayersCards(players);
    }
}
