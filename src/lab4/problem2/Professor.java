package lab4.problem2;

import java.time.LocalDate;

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