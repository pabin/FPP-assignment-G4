package lab2;

// PROBLEM 5
public class Pizza {
    public enum PizzaSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    public enum PizzaType {
        VEGGIE,
        PEPPERONI,
        CHEEZE,
        BBQCHICKEN
    }

    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;

    Pizza(PizzaSize size, PizzaType type, int quant) {
        this.pizzaSize = size;
        this.pizzaType = type;
        this.quantity = quant;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(PizzaSize.SMALL, PizzaType.VEGGIE, 2);
        Pizza pizza2 = new Pizza(PizzaSize.MEDIUM, PizzaType.PEPPERONI, 1);
        Pizza pizza3 = new Pizza(PizzaSize.LARGE, PizzaType.BBQCHICKEN, 2);

        pizza1.calculatePrice();
        pizza2.calculatePrice();
        pizza3.calculatePrice();

        System.out.println(pizza1.printOrderSummary());
        System.out.println(pizza2.printOrderSummary());
        System.out.println(pizza3.printOrderSummary());
    }

    private void calculatePrice() {
        double price1 = switch (this.pizzaSize) {
            case PizzaSize.SMALL -> 8;
            case PizzaSize.MEDIUM -> 10;
            case PizzaSize.LARGE -> 12;
        };

        double price2 = switch (this.pizzaType) {
            case PizzaType.VEGGIE -> 1;
            case PizzaType.PEPPERONI, PizzaType.BBQCHICKEN -> 2;
            case PizzaType.CHEEZE -> 1.5;
        };

        this.price = (price1 + price2) * this.quantity;
    }

    private String printOrderSummary() {
        PizzaSize s2 = this.pizzaSize;
        PizzaType s3 = this.pizzaType;
        int s4 = this.quantity;
        double s5 = this.price;
        double tax = this.price * 0.03;
        double total = s5 + tax;

        return String.format("Pizza Order:\nSize: %s\nType: %s\nQty: %d\nPrice: %.2f\nTax: %.2f\nTotal Price: %.2f\n", s2, s3, s4, s5, tax, total);
    }


}
