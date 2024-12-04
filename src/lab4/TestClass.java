package lab4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestClass {

    @Test
    public void testProduct() {
        double a = 1.0;
        System.out.println(a);
        Product p0 = new Electronics("Laptop", 21.0, "warranty1", 1.0); // 22.0
        Product p1 = new Furniture("Gloves", 1.0, "material", 1.0); //2.0
        Product p2 = new Clothing("Jacket", 2.0, "brand", .5); //1.0
        Product p3 = new Clothing("Boots", 4, "brand", .5);  // 2.0
        Product p4 = new Electronics("Watcher", 2.0, "warranty1", 1.0); //3.0
        int N = 5;
        Product[] products = new Product[N];
        products[0] = p0;
        products[1] = p1;
        products[2] = p2;
        products[3] = p3;
        products[4] = p4;

        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        assertEquals(30.0, sum);
    }
}
