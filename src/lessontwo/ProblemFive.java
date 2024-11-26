package lessontwo;

/*
Create a class Prog5 and implement the given method, which takes the two arrays of
inputs and combines the two arrays into a single array without using API. Write your own
logic.
public static int[] combine(int[] a, int[] b);
Example: Input array a : [5,6,-4,3,1]
Input array b: [ 3,8,9,11]
Output arrays: [ 5,6,-4,3,1, 3,8,9,11]
 */

public class ProblemFive {
    public static void main(String[] args) {
        int[] a = {3, 1, 6, 9, 2, 4};
        int[] b = {8, 0, 1, 5};

        int[] result = combine(a, b);
        for (int r : result) {
            System.out.print(r);
        }
    }

    public static int[] combine(int[] a, int[] b) {
        int totalLength = a.length + b.length;
        int[] combinedArray = new int[totalLength];

        int index1 = 0;
        int index2 = 0;

        for (int i=0; i<totalLength; i++) {
            if (i < a.length) {
                combinedArray[i] = a[index1];
                index1++;
            } else {
                combinedArray[i] = b[index2];
                index2++;
            }
        }
        return combinedArray;
    }
}
