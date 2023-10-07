package TresorGame;

import entity.Aventurier;

import java.util.Arrays;
import java.util.List;

public class Tresor {
    private char[][] map; // the cart
    private List<Aventurier> aventuriers; // adventurers list

// Method to read the input file and initialize the map and adventurers

    public void readInputFile(String inputFile) {
        // Read the input file and initialize the map and adventurers
    }

    // Method for simulating the movements of adventurers

    public void simulateMovements() {
        // Simulate the movements of adventurers
    }

    // Method to write the output file

    public void writeOutputFile(String outputFile) {
        // Write the output file
    }

    public char[][] getMap() {
        return map;
    }

    public void setMap(char[][] map) {
        this.map = map;
    }

    public List<Aventurier> getAventuriers() {
        return aventuriers;
    }

    public void setAventuriers(List<Aventurier> aventuriers) {
        this.aventuriers = aventuriers;
    }

    public int getMapWidth() {
        return map != null ? map[0].length : 0;
    }

    public int getMapHeight() {
        return map != null ? map.length : 0;
    }

    @Override
    public String toString() {
        return "Tresor{" +
                "map=" + Arrays.toString(map) +
                ", aventuriers=" + aventuriers +
                '}';
    }

}
