package lab4.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Camara", 25000, LocalDate.parse("2002-11-11"));
        Professor p2 = new Professor("Drison", 30000, LocalDate.parse("1998-11-11"));
        Professor p3 = new Professor("Edward", 20000, LocalDate.parse("2012-11-11"));
        Secretary s1 = new Secretary("Shreya", 10000, LocalDate.parse("2018-11-11"));
        Secretary s2 = new Secretary("Priya", 12000, LocalDate.parse("2015-11-11"));

        s1.setOvertimeHours(5);
        s2.setOvertimeHours(10);

        DepartmentEmployee[] department = new DepartmentEmployee[5];
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to see the total sum of salaries ? (y/n)");
        String response = scanner.nextLine();
        if (response.equals("y") || response.equals("Y")) {
            double sum = 0.0;
            for (DepartmentEmployee d : department) {
                sum += d.computeSalary();
            }
            System.out.println("Total Salary: " + sum);
            System.out.println("Average Salary: " + sum / department.length);
        }
    }
}
