package lesson12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {
    public static void receiveInput() throws UnsupportedOperationException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a number between 0-100");
        int input = scanner.nextInt();

        if (input < 0) {
            throw new UnsupportedOperationException("negative number is not allowed");
        } else if (input > 100) {
            throw new UnsupportedOperationException("number not in range (0-100)");
        } else {
            System.out.println("correct input, your input is: " + input);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                receiveInput();
            } catch (InputMismatchException e) {
                System.out.println("input mismatch error");
            } catch (UnsupportedOperationException e) {
                System.out.println("err: " + e.getMessage());
            }

            System.out.println();
            System.out.println("do you want to try again ? (y/n)");
            String answer = scanner.nextLine();
            System.out.println(answer);
            if (!answer.equals("y") && !answer.equals("Y")) {
                break;
            }
        }
    }
}
