package lessontwo;

/*
Create a class Prog2. Inside its main method, create float variables to store each of the following
numbers:
1.27, 3.881, 9.6
Output to the console the following two values:
1. The sum of the floats as an integer, obtained by casting the sum to type int
2. The sum of the floats as an integer is obtained by rounding the sum to the nearest integer
using the Math.round function.
*/

public class Prog2 {
    public static void main(String[] args) {
        float variable1 = 1.27f;
        float variable2 = 3.881f;
        float variable3 = 9.6f;

        int sumOne = (int) (variable1 + variable2 + variable3);

        int sumTwo = Math.round(variable1 + variable2 + variable3);

        System.out.println("sum one is: " + sumOne);
        System.out.println("sum two is: " + sumTwo);
    }
}
