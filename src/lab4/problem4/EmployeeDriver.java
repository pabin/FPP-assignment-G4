package lab4.problem4;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new CommissionEmployee("Julia", "Roberts", 115, 25);
        Employee e2 = new CommissionEmployee("Chandler", "Bing", 133, 20);
        Employee e3 = new HourlyEmployee("Walter", "White", 98, 40);
        Employee e4 = new SalariedEmployee("Jessie", "Pinkman", 3500);
        Employee e5 = new BasePlusCommissionEmployee("Rachel", "Green", 5000, 72, 25);

        Employee[] employees = new Employee[5];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;

        Employee employee = getEmpoyeeWithMaxSalary(employees);
        System.out.println("Employee Details:");
        System.out.println(employee.toString());
    }

    public static Employee getEmpoyeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmp = employees[0];
        for (Employee employee : employees) {
            if (employee.getPayment() > maxSalaryEmp.getPayment()) {
                maxSalaryEmp = employee;
            }
        }
        return maxSalaryEmp;
    }
}
