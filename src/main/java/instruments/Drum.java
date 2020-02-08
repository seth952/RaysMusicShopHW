package instruments;

import instruments.Instrument;
import instruments.InstrumentType;

public class Drum extends Instrument {

    private int numberOfDrums;

    public Drum(String material, String colour, String sound, InstrumentType type, double buyPrice, double sellPrice, int numberOfDrums) {
        super(material, colour, sound, type, buyPrice, sellPrice);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    @Override
    public String play() {
        return getSound();
    }
}
