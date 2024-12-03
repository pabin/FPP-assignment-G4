package lab4;

import java.time.LocalDate;
import java.util.Scanner;

public class Problem4 {
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

class DepartmentEmployee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    DepartmentEmployee(String name, double salary, LocalDate hdate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hdate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public double computeSalary() {
        return this.salary;
    }
}

class Professor extends DepartmentEmployee {
    private int noOfPublications;

    Professor(String name, double salary, LocalDate hDate) {
        super(name, salary, hDate);
    }

    public void setNoOfPublications(int noOfPub) {
        this.noOfPublications = noOfPub;
    }

    public int getNoOfPublication() {
        return this.noOfPublications;
    }

}

class Secretary extends DepartmentEmployee {
    private double overtimeHours;

    Secretary(String name, double salary, LocalDate hDate) {
        super(name, salary, hDate);
    }

    public void setOvertimeHours(double otHours) {
        this.overtimeHours = otHours;
    }

    public double getOvertimeHours() {
        return this.overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + this.overtimeHours * 12;
    }
}