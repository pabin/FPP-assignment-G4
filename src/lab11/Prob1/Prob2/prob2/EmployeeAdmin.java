package lab11.Prob1.Prob2.prob2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> empList = new ArrayList<>();
        for (String key : socSecNums) {
            if (table.containsKey(key)) {
                if (table.get(key).getSalary() > 80000) {
                    empList.add(table.get(key));
                }
            }
        }
		return empList;
	}
	
}
