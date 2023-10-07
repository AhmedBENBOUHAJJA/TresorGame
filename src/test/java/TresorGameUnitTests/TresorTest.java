package TresorGameUnitTests;

import TresorGame.Tresor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TresorTest {
    @Test
    public void testReadInputFile() {
        // Tests for reading the input file
        Tresor tresor = new Tresor();
        tresor.readInputFile("input.txt");

        // Verify that the map and adventurers are correctly initialized
        assertEquals(3, tresor.getMapWidth());
        assertEquals(4, tresor.getMapHeight());
        assertEquals(1, tresor.getAventuriers().size());
    }

    @Test
    public void testSimulateMovements() {
        // Tests for simulating adventurers' movements
    }

    @Test
    public void testWriteOutputFile() {
        // Tests for writing the output file
    }
}
