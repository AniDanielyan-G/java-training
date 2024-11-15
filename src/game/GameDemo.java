package game;
public class GameDemo {
    public static void main(String[] args) {
        // 2 players
//        Game game = new Game();

        // bot vs player
//        Game game = new Game(new Board(), new Player('X', true, true), new Player('O', false, false));

        // 2 bots
        Game game = new Game(new Board(), new Player('X', true, true), new Player('O', true, true));

        System.out.println(game.playGame());
    }
}