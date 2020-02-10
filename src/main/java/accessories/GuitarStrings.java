package accessories;

import behaviours.ISell;

public class GuitarStrings extends Accessories implements ISell {



    public GuitarStrings(double buyPrice, double sellPrice, String description) {
        super(buyPrice, sellPrice, description);


    }

    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();

    }
}
