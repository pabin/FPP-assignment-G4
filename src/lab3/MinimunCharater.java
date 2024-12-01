package lab3;

public class MinimunCharater {

    public static char findMinimumCharacter(String s) {
        int len = s.length();
        int mid = len/2;
        if (s.length() == 1) return s.charAt(0);
        char minChar = findMinimumCharacter(s.substring(0, mid));
        char maxChar = findMinimumCharacter(s.substring(mid, len));
        return minChar < maxChar ? minChar:maxChar;
    }

    public static void main(String[] args) {
        System.out.println(findMinimumCharacter("cblk"));
    }
}
