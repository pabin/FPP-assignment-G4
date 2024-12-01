package lab3;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse(int[] arr, int left, int right) {
        if(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            reverse(arr, left + 1, right - 1);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13};
        System.out.println("Input " + Arrays.toString(arr));
        System.out.println("Output " +Arrays.toString(reverse(arr, 0, arr.length-1)));
    }
}
