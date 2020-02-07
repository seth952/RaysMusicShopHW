package instruments;

import instruments.Instrument;
import instruments.InstrumentType;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String material, String colour, String sound, InstrumentType type, double buyPrice, double sellPrice, int numberOfStrings) {
        super(material, colour, sound, type, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return getSound();
    }
}
