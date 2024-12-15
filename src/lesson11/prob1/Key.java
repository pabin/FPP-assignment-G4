package lesson11.prob1;

import java.util.Objects;

public class Key {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName);
    }

    @Override
    public boolean equals(Object key) {
        if (key == null) return false;
        if (key.getClass() != this.getClass()) return false;
        Key k = (Key) key;
        return this.getFirstName().equals(k.getFirstName()) && this.getLastName().equals(k.getLastName());
    }
}
