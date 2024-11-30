package lab2;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input) {
                case "C", "c":
                    System.out.println("Enter radius of Circle");
                    double radius = scanner.nextDouble();

                    Circle circle = new Circle(radius);
                    System.out.printf("Area of Circle is: %.2f\n", circle.computeArea());
                    break;
                case "R", "r":
                    System.out.println("Enter length of Rectangle");
                    double length = scanner.nextDouble();
                    System.out.println("Enter width of Rectangle");
                    double width = scanner.nextDouble();

                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.printf("Area of rectangle is: %.2f", rectangle.computeArea());
                    break;
                case "T", "t":
                    System.out.println("Enter base of Triangle");
                    double base = scanner.nextDouble();
                    System.out.println("Enter height of Triangle");
                    double height = scanner.nextDouble();

                    Triangle triangle = new Triangle(base, height);
                    System.out.printf("Area of triangle is: %.2f", triangle.computeArea());
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("\n\nDo you want to continue? (y/n) :");
            String tryAgain = scanner.next();
            if (tryAgain.equals("n")) {
                break;
            } else if (!tryAgain.equals("y")) {
                System.out.println("Invalid input");
                break;
            }
        }
    }
}

record Triangle(double base, double height) {
    public double computeArea() {
        return base * height * 0.5;
    }
}

record Circle(double radius) {
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

final class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double computeArea() {
        return this.length * this.width;
    }
}





