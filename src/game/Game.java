package game;
public class Game {
    private Player playerX;
    private Player playerO;
    private Board board;

    // Constructors
    public Game() {
        this.board = new Board();
        this.playerX = new Player('X');
        this.playerO = new Player('O');
    }

    public Game(Board board) {
        this.board = board;
        this.playerX = new Player('X');
        this.playerO = new Player('O');
    }

    public Game(Board board, Player playerX, Player playerO) {
        this.board = board;
        this.playerX = playerX;
        this.playerO = playerO;
    }

    public String playGame() {
        Player currentPlayer = playerX;
        while (!board.isBoardFull()) {
            board.printBoard();
            String move = getMove(currentPlayer);
            if (board.submitMove(move, currentPlayer.getMarker())) {
                if (board.isWinner(currentPlayer.getMarker())) {
                    return "Player " + currentPlayer.getMarker() + " wins!";
                }
                currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
        return board.isTie(playerX.getMarker(), playerO.getMarker()) ? "Tie" : "Unknown";
    }

    private String getMove(Player currentPlayer) {
        if (currentPlayer.isBot()) {
            if (currentPlayer.isStrategyRandom()) {
                return currentPlayer.getMoveRandom(board);
            } else {
                return currentPlayer.getMoveSimple(board);
            }
        } else {
            return currentPlayer.getMove(board);
        }
    }
}