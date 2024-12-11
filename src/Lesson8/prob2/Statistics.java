package Lesson8.prob2;

import java.util.List;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double sum = 0.0;

        //implement
        //compute sum of all salaries of people in aList and return
        for (EmployeeData a : aList) {
            sum += a.getSalary();
        }
        return sum;
    }
}
