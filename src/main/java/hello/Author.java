package hello;

import org.springframework.data.annotation.Id;

public class Author {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Author() {}

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
            "Author[id=%s, firstName='%s', lastName='%s']",
            id, firstName, lastName);
    }


}
