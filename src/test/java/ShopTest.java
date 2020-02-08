import com.sun.tools.javac.jvm.Items;
import instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar1;
    private Guitar guitar2;
    private Piano piano1;
    private Piano piano2;
    private Drum drum1;
    private Drum drum2;
    private SheetMusic sheetMusic1;
    private SheetMusic sheetMusic2;
    private GuitarStrings guitarStrings1;
    private GuitarStrings guitarStrings2;



    @Before
    public void before(){
        guitar1 = new Guitar("Wood", "Sunburst", "Twang", InstrumentType.STRINGS, 300, 400, 6);
        guitar2 = new Guitar("Pine", "Fender Red", "Strum", InstrumentType.STRINGS, 200, 500, 6);
        piano1 = new Piano("Ivory", "Black", "Plinky Plonky", InstrumentType.WOODWIND, 1000, 1500, 88);
        piano2 = new Piano("Oak", "White", "Plonky Plinky", InstrumentType.WOODWIND, 2000, 2500, 89);
        drum1 = new Drum("Steel", "Blue", "Tippy Tap", InstrumentType.PERCUSSION, 200, 300, 5);
        drum2 = new Drum("Brass", "Green", "Clank", InstrumentType.PERCUSSION, 500, 700, 6);
        sheetMusic1 = new SheetMusic(10, 26, "Best of Dylan");
        sheetMusic2 = new SheetMusic(15, 30, "Best of Springsteen");
        guitarStrings1 = new GuitarStrings(8, 16, "Brass medium strings");
        guitarStrings2 = new GuitarStrings(11, 20, "Bronze easy strings");
        shop = new Shop();



    }

    @Test
    public void buyItems(){
        shop.addItem(guitarStrings1);
        shop.addItem(guitarStrings2);
        assertEquals(2, shop.countStock());

    }
    @Test
    public void removeItems(){
        shop.addItem(guitarStrings1);
        shop.addItem(guitarStrings2);
        shop.removeItem(guitarStrings1);
        assertEquals(1, shop.countStock());

    }



    @Test
    public void stockCount(){
        assertEquals(0, shop.countStock());
    }
}
