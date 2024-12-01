package lab3;

/*
Write a recursive solution to check whether the given number is Palindrome or not. you can
have public utility method and private a recursive method. Return a boolean value.
Example: If you input an int value 121 – return true
    If your input is negative return false.
    If the input is 102 return false.
 */
public class Problem4 {
    public static void main(String[] args) {
        Problem4 test1 = new Problem4();
        System.out.println(test1.isPalindrome(121));
        System.out.println(test1.isPalindrome(102));
        System.out.println(test1.isPalindrome(3223));
        System.out.println(test1.isPalindrome(35153));
        System.out.println(test1.isPalindrome(33153));
    }

    public int reverse(int num, int intLen) {
        if (num <= 0) {
            return 0;
        } else {
            int digit = (num % 10) * (int) (Math.pow(10, intLen - 1));
            return digit + reverse(num / 10, intLen - 1);
        }
    }

    public boolean isPalindrome(int n) {
        int intLen = findLength(n);
        return n == reverse(n, intLen);
    }

    public int findLength(int n) {
        int length = 0;
        while (n > 0) {
            n /= 10;
            length++;
        }
        return length;
    }
}
