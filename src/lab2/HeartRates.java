package lab2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private static final int RESTING_HEART_RATE = 70;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;

    public HeartRates(String fistName, String lastName, String dateOfBirth) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFistName() {
        return firstName;
    }

    public void setFistName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString(int age, int maxHeartRates) {           //using these toString to avoid the output like this [com.steve.test.Student@6e1408, com.steve.test.Student@e53108]
        return "First Name: " + firstName + "\n" + "Last Name " + lastName + "\n" + "Age " + age + "\n" + "Date of birth: " + dateOfBirth + "\n" + "Maximum heart rate:" + maxHeartRates + "";
    }

    public static Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    public Period getBirthday(HeartRates heartRates) {
        Scanner scanner = new Scanner(System.in);

        LocalDate birthday;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        while (true) {
            String input = scanner.nextLine();
            heartRates.setDateOfBirth(input);

            try {
                birthday = LocalDate.parse(input, formatter);

                LocalDate today = LocalDate.now();
                System.out.println(Period.between(birthday, today));
                return Period.between(birthday, today);

            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public static int calculateMaxHeartRate(int age) {
        return 220 - age;
    }

    public static int avgHeartRates(int maxHeartRates) {
        return maxHeartRates - RESTING_HEART_RATE;
    }

    public static double lowerBounderyHeartRates(int avgHeartRates) {
        return avgHeartRates * LOWER_BOUNDARY + RESTING_HEART_RATE;
    }

    public static double upperBounderyHeartRates(int avgHeartRates) {
        return avgHeartRates * UPPER_BOUNDARY + RESTING_HEART_RATE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate birthday;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        HeartRates heartRates = new HeartRates("", "", "");

        System.out.println("Please, enter your first name: ");
        heartRates.setFistName(sc.next());
        sc.nextLine();

        System.out.println("Please, enter your last name: ");
        heartRates.setLastName(sc.next());
        sc.nextLine();

        System.out.println("Please, enter your birthday in the format-"
                + " yyyy-MM-dd -Example 1980-9-28): ");

        while (true) {
            String input = sc.nextLine();
            heartRates.setDateOfBirth(input);

            try {
                birthday = LocalDate.parse(input, formatter);

                LocalDate today = LocalDate.now();
                Period.between(birthday, today);
                int age = Period.between(birthday, today).getYears();
                int maxHeartRates = calculateMaxHeartRate(age);
                int avgHeartRate = avgHeartRates(maxHeartRates);
                double lowerBounderyHeartRates = lowerBounderyHeartRates(avgHeartRate);
                double upperBounderyHeartRates = upperBounderyHeartRates(avgHeartRate);
                System.out.println("The Target Heart Rate Range Is Between " + lowerBounderyHeartRates + " And " + upperBounderyHeartRates);
                System.out.println(heartRates.toString(age, maxHeartRates));
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }

        }

    }
}
