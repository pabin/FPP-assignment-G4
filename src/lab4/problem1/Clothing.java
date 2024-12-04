package lab4.problem1;

public class Clothing extends Product {

    private String brand;
    private double discount_percentage;

    public Clothing(String productName, double price, String brand, double discount_percentage) {
        super(productName, price);
        this.brand = brand;
        this.discount_percentage = discount_percentage;
    }

    @Override
    public double getPrice() {
       return super.getPrice()*discount_percentage;
   }
}
