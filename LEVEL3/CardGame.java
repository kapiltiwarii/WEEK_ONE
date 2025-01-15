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
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        
        for (int i = 0; i < deck.length; i++) {
            // Generate a random card index between i and deck.length - 1
            int randomCardNumber = i + random.nextInt(deck.length - i);
            // Swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) {
            System.out.println("The deck cannot be evenly distributed among players.");
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        int index = 0;

        // Distribute cards to players
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print the players' cards
    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return;
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck of cards
        String[] deck = initializeDeck();
        int numOfCards = deck.length;

        // Shuffle the deck
        shuffleDeck(deck);

        // Take number of players and number of cards to distribute as input
        System.out.print("Enter number of players: ");
        int x = scanner.nextInt();

        System.out.print("Enter number of cards to distribute: ");
        int n = scanner.nextInt();

        // Distribute cards and store the result
        String[][] players = distributeCards(deck, n, x);

        // Print the players and their cards
        printPlayersCards(players);

       
    }
}
