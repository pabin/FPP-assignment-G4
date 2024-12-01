package lab3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Problem4Test {
    @Test
    public void TestFindLength() {
        Problem4 prob4 = new Problem4();

        int result = prob4.findLength(12348);
        assertEquals(result, 5);

        int result2 = prob4.findLength(314);
        assertEquals(result2, 3);
    }

    @Test
    public void TestIntReverse() {
        Problem4 prob4 = new Problem4();

        int result = prob4.reverse(3223, 4);
        assertEquals(result, 3223);

        int result2 = prob4.reverse(1234, 4);
        assertEquals(result2, 4321);

        int result3 = prob4.reverse(0, 1);
        assertEquals(result3, 0);
    }

    @Test
    public void TestIfIsPalindrome() {
        Problem4 prob4 = new Problem4();

        boolean result = prob4.isPalindrome(3223);
        assertTrue(result, "3223 is a palindrome number");

        boolean result2 = prob4.isPalindrome(4567);
        assertFalse(result2, "4567 is a not a palindrome number");
    }
}
