package ex5;

import java.io.IOException;

public class Game {
    public enum Option {
        SCANNER,
        BUFFER
    }

    public static void main(String[] args) {
        try {
            // Using BUFFER to read the map
            System.out.println("Reading map with BUFFER:");
            Map mapBuffer = new Map("./resources/input_1.txt", Game.Option.BUFFER);
            mapBuffer.printMap();

            // Using SCANNER to read the map
            System.out.println("\nReading map with SCANNER:");
            Map mapScanner = new Map("./resources/input_2.txt", Game.Option.SCANNER);
            mapScanner.printMap();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
