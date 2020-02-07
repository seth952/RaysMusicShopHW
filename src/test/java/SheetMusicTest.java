import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;


    @Before
    public void before(){
        sheetMusic = new SheetMusic(10, 26, "Best of Dylan");
    }


    @Test
    public void hasBuyPrice(){
        assertEquals(10, sheetMusic.getBuyPrice(),0.01);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(26, sheetMusic.getSellPrice(),0.01);
    }
    @Test
    public void hasDescription(){
        assertEquals("Best of Dylan", sheetMusic.getDescription());
    }
    @Test
    public void markUpSellPrice(){
        assertEquals(16, sheetMusic.calculateMarkup(),0.00);
    }
}
