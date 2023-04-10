package Lession1;

import java.util.Objects;

public class Author {
    private String lastName;
    private String firstName;
    public Author(String lastName, String firstName){
        this.lastName=lastName;
        this.firstName= firstName;

    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String toString(){
        return "Фамилия "+this.lastName+" Имя "+this.firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return lastName.equals(author.lastName) && firstName.equals(author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }
}
