package exercises.arrays.arraysClass.task;

import java.util.Objects;

public class Person {
    private String person;
    private String surname;
    private String PESEL;

    public Person(String person, String surname, String PESEL) {
        this.person = person;
        this.surname = surname;
        this.PESEL = PESEL;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person1 = (Person) o;
        return Objects.equals(person, person1.person) &&
                Objects.equals(surname, person1.surname) &&
                Objects.equals(PESEL, person1.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, surname, PESEL);
    }

    @Override
    public String toString() {
        return "Person{" +
                "person='" + person + '\'' +
                ", surname='" + surname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
