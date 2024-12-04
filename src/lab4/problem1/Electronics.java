package lab4.problem1;

public class Electronics extends Product{

    private String warranty;
    private double warrantyCost;

    public Electronics(String productName, double price, String warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    public String getWarranty() {
        return warranty;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }
}
