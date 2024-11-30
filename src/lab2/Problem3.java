package lab2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Problem3 {
    private String eventName;
    private LocalDate eventDate;
    private LocalTime eventTime;

    public static void main(String[] args) {
        Problem3 event = new Problem3();
        event.createEvent();

        System.out.println("\nEvent Details:");
        System.out.println(event.getEventDetails());
        System.out.println(event.getMoreInfo());
        event.getEventTimeOnDiffZone();
    }

    public void createEvent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter event name:");
        this.eventName = scanner.nextLine();

        while (true) {
            System.out.println("Enter event date (yyyy-MM-dd):");
            String eveDate = scanner.nextLine();
            try {
                LocalDate date = LocalDate.parse(eveDate);
                this.eventDate = date;
                if (date.isAfter(LocalDate.now())) {
                    break;
                } else {
                    System.out.print("Err, date is in the past\n");
                }
            } catch (Exception e) {
                System.out.print("Err, Invalid date\n");
            }
        }

        while (true) {
            System.out.println("Enter event time (HH:mm:SS):");
            String eveTime = scanner.nextLine();
            try {
                this.eventTime = LocalTime.parse(eveTime);
                break;
            } catch (Exception e) {
                System.out.print("Err, invalid time\n");
            }
        }
    }

    public String getEventDetails() {
        LocalDateTime localDT = this.getDateTime();
        String sourceZone = ZoneId.systemDefault().toString();

        String name = "\nEvent Name: " + this.eventName;
        String date = "\nDate & Time: " + this.tzConverter(localDT, sourceZone);
        return name + date;
    }


    public void getEventTimeOnDiffZone() {
        Scanner scanner = new Scanner(System.in);

        whileLoop:
        while (true) {
            System.out.println("\nEnter time zone number for tz based date/time:");
            System.out.println("1. America/Panama");
            System.out.println("2. America/Chicago");
            System.out.println("3. America/Indiana/Indianapolis");
            System.out.println("4. America/Santiago");
            System.out.println("5. America/Phoenix");

            int timeZone = scanner.nextInt();
            if (timeZone == 1) {
                String dateTZ = this.tzConverter(this.getDateTime(), "America/Panama");
                System.out.println("Event Date Time for America/Panama:\n" + dateTZ);
            } else if (timeZone == 2) {
                String dateTZ = this.tzConverter(this.getDateTime(), "America/Chicago");
                System.out.println("Event Date Time for America/Chicago:\n" + dateTZ);
            } else if (timeZone == 3) {
                String dateTZ = this.tzConverter(this.getDateTime(), "America/Indiana/Indianapolis");
                System.out.println("Event Date Time for America/Indiana/Indianapolis:\n" + dateTZ);
            } else if (timeZone == 4) {
                String dateTZ = this.tzConverter(this.getDateTime(), "America/Santiago");
                System.out.println("Event Date Time for America/Santiago:\n" + dateTZ);
            } else if (timeZone == 5) {
                String dateTZ = this.tzConverter(this.getDateTime(), "America/Phoenix");
                System.out.println("Event Date Time for America/Phoenix:\n" + dateTZ);
            } else {
                System.out.println("Err, invalid time zone");
                break;
            }

            System.out.println("\n\nCheck for another time zone? (y/n) :");
            String checkAgain = scanner.next();
            if (checkAgain.equals("n")) {
                break;
            } else if (!checkAgain.equals("y")) {
                System.out.println("Invalid input");
                break;
            }
        }
    }

    public String getMoreInfo() {
        LocalDate today = LocalDate.now();
        long remDays = ChronoUnit.DAYS.between(today, this.eventDate);

        String rem = "Remaining Days: " + remDays;
        String isLeapYear = this.eventDate.isLeapYear() ? "Yes" : "No";
        String leapYear = "Is Leap Year ?: " + isLeapYear;
        return rem + "\n" + leapYear;
    }

    public LocalDateTime getDateTime() {
        int hour = this.eventTime.getHour();
        int minute = this.eventTime.getMinute();
        int second = this.eventTime.getSecond();
        return this.eventDate.atTime(hour, minute, second);
    }

    public String tzConverter(LocalDateTime localDT, String targetTZone) {
        ZoneId sourceZone = ZoneId.systemDefault();
        ZoneId targetZone = ZoneId.of(targetTZone);

        ZonedDateTime sourceZonedDateTime = localDT.atZone(sourceZone);
        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(targetZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ hh:mm z");
        return targetZonedDateTime.format(formatter);
    }
}
