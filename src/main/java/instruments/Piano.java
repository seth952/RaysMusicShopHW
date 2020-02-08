package instruments;

import instruments.Instrument;
import instruments.InstrumentType;

public class Piano extends Instrument{

    private int numberOfKeys;


    public Piano(String material, String colour, String sound, InstrumentType type, double buyPrice, double sellPrice, int numberOfKeys) {
        super(material, colour, sound, type, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    @Override
    public String play() {
        return getSound();
    }
}
