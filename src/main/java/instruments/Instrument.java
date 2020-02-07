package instruments;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private String sound;
    private InstrumentType type;
    private double buyPrice;
    private double sellPrice;




    public Instrument(String material, String colour, String sound, InstrumentType type, double buyPrice, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.sound = sound;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getSound() {
        return sound;
    }

    public InstrumentType getType() {
        return type;
    }
    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
