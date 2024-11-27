package lessontwo;

/*
Create a Java method to find the second minimum value. Write your own logic without API usage.
public static void secondMin(int[] arrayOfInts)
(in a class Prog6) that outputs the second minimum of an array of ints.
Example: The method prints the result of second minimum 1 for the given array of int inputs.
        [2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22]
NOTE: You may not use the sorting tools available in the Java libraries; for instance, you
may not call Arrays.sort() to sort the input array. (No credit if you do it this way.)
*/

public class Prog6 {
    public static void main(String[] args) {
        int[] nums = {3,1, 0,6,9,4};
//        int[] nums = {8,6,9, 1,2,4};
        int result = secondMin(nums);
        System.out.println("result:" +  result);
    }

    public static int secondMin(int[] arrayOfInts) {
        int minValue = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arrayOfInts) {
            if (num < minValue) {
                minValue = num;
            }
        }

        for (int num : arrayOfInts) {
            if (num > minValue && num < secondMin) {
                secondMin = num;
            }
        }
        return secondMin;
    }
}
