import instruments.IPlay;

import java.util.ArrayList;

public class Shop implements ISell, IPlay {

    private ArrayList<ISell> stock;


    public Shop() {
        this.stock = new ArrayList<>();
    }


    public void addItem(ISell item) {
        this.stock.add(item);
    }


    public void removeItem(ISell item) {
        this.stock.add(item);
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }

    @Override
    public String play() {
        return null;
    }

    public int countStock() {
        return this.stock.size();
    }
}