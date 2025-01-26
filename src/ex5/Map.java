package ex5;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Map {
    private char[][] tiles;
    private int height;
    private int width;

    /**
     * Constructor that initializes the Map using a file.
     *
     * @param path   the file path to read the map from.
     * @param option whether to use SCANNER or BUFFER for reading.
     * @throws IOException if the file cannot be read.
     */
    public Map(String path, Game.Option option) throws IOException {
        if (option == Game.Option.BUFFER) {
            readUsingBuffer(path);
        } else if (option == Game.Option.SCANNER) {
            readUsingScanner(path);
        }
    }

    private void readUsingBuffer(String path) throws IOException {
        Path filePath = Path.of(path);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            height = Integer.parseInt(reader.readLine());
            width = Integer.parseInt(reader.readLine());
            tiles = new char[height][width];

            for (int i = 0; i < height; i++) {
                String[] line = reader.readLine().split(" ");
                for (int j = 0; j < width; j++) {
                    tiles[i][j] = line[j].charAt(0);
                }
            }
        }
    }

    private void readUsingScanner(String path) throws IOException {
        try (Scanner scanner = new Scanner(new File(path))) {
            height = scanner.nextInt();
            width = scanner.nextInt();
            tiles = new char[height][width];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    tiles[i][j] = scanner.next().charAt(0);
                }
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tiles[i][j] + " ");
            }
            System.out.println();
        }
    }
}

