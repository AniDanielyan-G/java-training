package game;
import java.util.Scanner;

public class Player {
    private char marker;
    private boolean isBot = false;
    private boolean isStrategyRandom = true;

    // Constructors
    public Player() {
        this.marker = 'X';
    }

    public Player(char marker) {
        this.marker = marker;
    }

    public Player(char marker, boolean isBot, boolean strategyRandom) {
        this.marker = marker;
        this.isBot = isBot;
        this.isStrategyRandom = strategyRandom;
    }

    public Player(Player that) {
        this.marker = that.marker;
        this.isBot = that.isBot;
        this.isStrategyRandom = that.isStrategyRandom;
    }

    public boolean isBot() {
        return isBot;
    }

    public boolean isStrategyRandom() {
        return isStrategyRandom;
    }

    // Accessor
    public char getMarker() {
        return marker;
    }

    public String getMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter move (row and column): ");
        return scanner.nextLine();
    }

    public String getMoveRandom(Board board) {
        int row, col;
        do {
            row = (int) (Math.random() * 3);
            col = (int) (Math.random() * 3);
        } while (board.getCells()[row][col] != ' ');
        return "" + row + col;
    }

    public String getMoveSimple(Board board) {
        // Check middle for empty board
        if (board.isBoardEmpty()) return "11";
        return getMoveRandom(board); // Default to random
    }
}