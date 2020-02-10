package instrumentTests;

import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood", "Sunburst", "Twang", InstrumentType.STRINGS, 300, 400, 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Sunburst", guitar.getColour());
    }
    @Test
    public void hasSound(){
        assertEquals("Twang", guitar.getSound());
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }
    @Test
    public void hasBuyPrice(){
        assertEquals(300, guitar.getBuyPrice(), 0.01);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(400, guitar.getSellPrice(), 0.01);
    }
    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }
    @Test
      public void canPlay() {
        guitar.play();
        assertEquals("Twang", guitar.getSound());
    }




}
