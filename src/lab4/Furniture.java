package lab4;

public class Furniture extends Product {

    private String material;
    private double shipppingCost;

    public Furniture(String productName, double price, String material, double shipppingCost) {
        super(productName, price);
        this.material = material;
        this.shipppingCost = shipppingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shipppingCost;
    }

}
