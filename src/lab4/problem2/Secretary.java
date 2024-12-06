package lab4.problem2;

import java.time.LocalDate;

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
        return super.computeSalary() + this.getOvertimeHours() * 12;
    }
}