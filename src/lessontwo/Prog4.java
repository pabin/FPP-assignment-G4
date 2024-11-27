package lessontwo;

import java.util.Arrays;

/*
Write a program called Prog4. Create an array that accepts only an array of Strings. Creates a
new array in which all duplicate Strings in the original input array have been removed. You
should not use any APIs like HashSet, TreeSet, etc., Write your own logic. Also, your result
should not contain null values.
For example, if the input array is ["horse", "dog", "cat", "horse", dog"]
then the output would be the following array:
["horse", "dog", "cat"]
 */
public class Prog4 {

    public static void main(String[] args) {
        String[] str =  {"horse", "dog", "cat", "horse", "dog", "dog"};
        String[] result = removeDuplicates(str);
        System.out.println(Arrays.toString(result));
    }

    public static String[] removeDuplicates(String[] list) {
        int N = list.length;
        int duplicates = 0;

        if (list.length != 0) {
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (!list[i].equals("visited") && !list[j].equals("visited")  && list[i].equals(list[j])) {
                        list[j] = "visited";
                        duplicates++;
                    }
                }
            }
        }
        int L = N - duplicates;

        String[] result = new String[L];
        int k = 0;
        for (String s : list) {
            if (!s.equals("visited")) {
                result[k] = s;
                k++;
            }

        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}
