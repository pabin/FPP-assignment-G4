package lab4.problem2;

import java.time.LocalDate;

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
