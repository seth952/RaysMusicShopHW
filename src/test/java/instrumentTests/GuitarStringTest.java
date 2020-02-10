package instrumentTests;

import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    private GuitarStrings guitarStrings;


    @Before
    public void before(){
        guitarStrings = new GuitarStrings(15, 20, "Brass medium strings");
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(15, guitarStrings.getBuyPrice(),0.01);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(20, guitarStrings.getSellPrice(),0.01);
    }
    @Test
    public void hasDescription(){
        assertEquals("Brass medium strings", guitarStrings.getDescription());
    }
    @Test
    public void markUpSellPrice(){
    assertEquals(5, guitarStrings.calculateMarkup(),0.00);
    }
}
