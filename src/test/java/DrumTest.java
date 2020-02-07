import instruments.Drum;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before(){
        drum = new Drum("Steel", "Blue", "Tippy Tap", InstrumentType.PERCUSSION, 500, 300, 5);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Steel", drum.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Blue", drum.getColour());
    }
    @Test
    public void hasSound(){
        assertEquals("Tippy Tap", drum.getSound());
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.PERCUSSION, drum.getType());
    }
    @Test
    public void hasBuyPrice(){
        assertEquals(500, drum.getBuyPrice(), 0.01);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(300, drum.getSellPrice(), 0.01);
    }
    @Test
    public void hasNumberOfStrings(){
        assertEquals(5, drum.getNumberOfDrums());
    }
    @Test
    public void canPlay() {
        drum.play();
        assertEquals("Tippy Tap", drum.getSound());
    }

}

