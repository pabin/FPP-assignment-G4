package lab1;

import java.util.Random;

/* Problem – 1
Create a class called Prog1. In the main method of the class, output to the console the result
of doing the following two computations:
    1. Get a random number x in the range 1 .. 9 and compute π^x
    2. Get a random number y in the range 3 .. 14 and compute y^π
Use Math API to solve π^x and y^π
To get the random numbers, apply the knowledge gained
from the Random Generator. Print the result two digits after decimal using System.out.prinf().
*/

public class Prog1 {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(1, 10);
        double result1 = Math.pow(Math.PI, x);

        int y = random.nextInt(3, 15);
        double result2 = Math.pow(y, Math.PI);

        System.out.printf("%.2f", result1);
        System.out.println('\n');
        System.out.printf("%.2f", result2);
    }
}
