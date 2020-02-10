import behaviours.ISell;

import java.util.ArrayList;

public class Shop {


    private ArrayList<ISell> stock;


    public Shop() {
        this.stock = new ArrayList<>();
    }


    public void addItem(ISell item ){
        this.stock.add(item);
    }


    public void removeItem(ISell item) {
        this.stock.remove(item);

    }

    


    public int countStock() {
        return this.stock.size();
    }


}