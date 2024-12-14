package lab11.Prob1.Prob2.prob2;

import java.util.Comparator;

public class CompareBySSN implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSsn().compareTo(e2.getSsn());
    }
}
