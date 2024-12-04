package lab4.problem4;

public abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    abstract double getPayment();

    abstract String getName();
}

class CommissionEmployee extends Employee {
    double grossSales;
    double commissionRate;

    CommissionEmployee(String f, String l, double s, double c) {
        this.firstName = f;
        this.lastName = l;
        this.grossSales = s;
        this.commissionRate = c;
    }

    double getPayment() {
        return this.grossSales * commissionRate;
    }

    String getName() {
        return super.firstName + " " + super.lastName;
    }

    @Override
    public String toString() {
        String s1 = "\nName: " + this.getName();
        String s2 = "\nGross Sales: " + this.grossSales;
        String s3 = "\nCommission Rate: " + this.commissionRate;
        String s4 = "\nTotal Payment: " + this.getPayment();
        return s1 + s2 + s3 + s4;
    }
}

class HourlyEmployee extends Employee {
    double wage;
    double hours;

    HourlyEmployee(String f, String l, double wage, double hours) {
        this.firstName = f;
        this.lastName = l;
        this.wage = wage;
        this.hours = hours;
    }

    double getPayment() {
        return this.wage * this.hours;
    }

    String getName() {
        return super.firstName + " " + super.lastName;
    }

    @Override
    public String toString() {
        String s1 = "\nName: " + this.getName();
        String s2 = "\nWage: " + this.wage;
        String s3 = "\nHours: " + this.hours;
        String s4 = "\nTotal Payment: " + this.getPayment();
        return s1 + s2 + s3 + s4;
    }
}

class SalariedEmployee extends Employee {
    double weeklySalary;

    SalariedEmployee(String f, String l, double weeklySalary) {
        this.firstName = f;
        this.lastName = l;
        this.weeklySalary = weeklySalary;
    }

    double getPayment() {
        return this.weeklySalary;
    }

    String getName() {
        return super.firstName + " " + super.lastName;
    }

    @Override
    public String toString() {
        String s1 = "\nName: " + this.getName();
        String s2 = "\nSalary: " + this.weeklySalary;
        String s3 = "\nTotal Payment: " + this.getPayment();
        return s1 + s2 + s3;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    BasePlusCommissionEmployee(String f, String l, double base, double sales, double comm) {
        super(f, l, sales, comm);
        this.baseSalary = base;
    }

    double getPayment() {
        return this.baseSalary + super.grossSales * super.commissionRate;
    }

    @Override
    public String toString() {
        String s1 = "\nName: " + this.getName();
        String s2 = "\nBase Salary: " + this.baseSalary;
        String s3 = "\nGross Sales: " + super.grossSales;
        String s4 = "\nCommission Rate: " + super.commissionRate;
        String s5 = "\nTotal Payment: " + this.getPayment();
        return s1 + s2 + s3 + s4 + s5;
    }
}
