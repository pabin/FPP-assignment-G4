package lab3;

/*
Write a recursive solution to return max value from the given array.
Example: [5, -3, 6, 1, 9, 4 ], Max = 9
 */
public class Problem5 {
    public static void main(String[] args) {
        Problem5 test = new Problem5();

        System.out.printf("\nmax: " + test.findMax(new int[]{5, -3, 6, 1, 9, 4}, -1));
        System.out.printf("\nmax: " + test.findMax(new int[]{1, 3, 4, 8, -9, 4}, -1));
        System.out.printf("\nmax: " + test.findMax(new int[]{2, 6, 1, 5, 0}, -1));
        System.out.printf("\nmax: " + test.findMax(new int[]{2, 6, 11, 5, 0}, -1));
    }

    public int findMax(int[] arr, int count) {
        if (count >= arr.length - 1) {
            return arr[count];
        } else {
            count++;
            int max = findMax(arr, count);
            return max > arr[count] ? max : arr[count];
        }
    }
}
