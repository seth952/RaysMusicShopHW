public abstract class Accessories {

    private String name;
    private double buyPrice;
    private double sellPrice;
    private String description;



    public Accessories(String name, double buyPrice, double sellPrice, String description) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }
    public String getName() {
        return name;
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
