package accessories;

import behaviours.ISell;

public class SheetMusic extends Accessories implements ISell {


    public SheetMusic(double buyPrice, double sellPrice, String description) {
        super(buyPrice, sellPrice, description);
    }

    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
