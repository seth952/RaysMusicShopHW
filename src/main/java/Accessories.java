public abstract class Accessories {


    private double buyPrice;
    private double sellPrice;
    private String description;



    public Accessories(double buyPrice, double sellPrice, String description) {

        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }


    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }
}
