package lesson9.problem4;

public class Ticket {
    final private int id;
    private String description;

    Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    int getId() {
        return this.id;
    }

    String getDescription() {
        return this.description;
    }

    void setDescription(String desc) {
        this.description = desc;
    }

    @Override
    public String toString() {
        return this.id + " -> " + this.description;
    }
}
