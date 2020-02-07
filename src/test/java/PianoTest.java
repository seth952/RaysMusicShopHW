import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Ivory", "Black", "Plinky Plonky", InstrumentType.WOODWIND, 1000, 1500, 88);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Ivory", piano.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }
    @Test
    public void hasSound(){
        assertEquals("Plinky Plonky", piano.getSound());
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.WOODWIND, piano.getType());
    }
    @Test
    public void hasBuyPrice(){
        assertEquals(1000, piano.getBuyPrice(), 0.01);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(1500, piano.getSellPrice(), 0.01);
    }
    @Test
    public void hasNumberOfStrings(){
        assertEquals(88, piano.getNumberOfKeys());
    }
    @Test
    public void canPlay() {
        piano.play();
        assertEquals("Plinky Plonky", piano.getSound());
    }

}
