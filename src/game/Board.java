package game;

import java.util.Arrays;

public class Board {
    private char[][] cells;

    // Constructors
    public Board() {
        cells = new char[3][3];
        for (char[] row : cells) {
            Arrays.fill(row, ' ');
        }
    }

    public Board(char[][] board) {
        this.cells = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.cells[i][j] = board[i][j];
            }
        }
    }

    public Board(Board that) {
        this(that.cells);
    }

    // Accessors and Mutators
    public char[][] getCells() {
        return cells;
    }

    public void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%s]", cells[i][j]);
            }
            System.out.println();
        }
    }

    public boolean submitMove(String move, char marker) {
        int row = Character.getNumericValue(move.charAt(0));
        int col = Character.getNumericValue(move.charAt(1));
        if (cells[row][col] == ' ') {
            cells[row][col] = marker;
            return true;
        }
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == ' ') return false;
            }
        }
        return true;
    }

    public boolean isBoardEmpty() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] != ' ') return false;
            }
        }
        return true;
    }

    public boolean isWinner(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((cells[i][0] == player && cells[i][1] == player && cells[i][2] == player) ||
                    (cells[0][i] == player && cells[1][i] == player && cells[2][i] == player)) {
                return true;
            }
        }
        // Check diagonals
        return (cells[0][0] == player && cells[1][1] == player && cells[2][2] == player) ||
                (cells[0][2] == player && cells[1][1] == player && cells[2][0] == player);
    }

    public boolean isTie(char playerX, char playerO) {
        return isBoardFull() && !isWinner(playerX) && !isWinner(playerO);
    }
}
