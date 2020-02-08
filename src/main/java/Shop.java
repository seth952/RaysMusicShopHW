import instruments.Drum;
import instruments.Guitar;
import instruments.IPlay;
import instruments.Piano;

import java.util.ArrayList;

public class Shop implements ISell {


    private ArrayList<ISell> stock;


    public Shop() {
        this.stock = new ArrayList<>();
    }


    public void addItem(ISell...items ) {
        for(ISell item : items)
        this.stock.add(item);
    }


    public void removeItem(ISell...items) {
        for(ISell item : items) {
            this.stock.remove(item);
        }
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }




    public int countStock() {
        return this.stock.size();
    }


}