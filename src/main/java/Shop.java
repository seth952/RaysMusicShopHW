import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;


    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }


    public void addItem(ISell item) {
        this.stock.add(item);
    }


    public void removeItem(ISell item) {
        this.stock.add(item);
    }
}