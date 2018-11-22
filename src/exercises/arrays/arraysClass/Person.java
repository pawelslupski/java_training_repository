package exercises.arrays.arraysClass;

import java.util.Objects;

public class Person {
    private String person;
    private String surnmame;
    private String PESEL;

    public Person(String person, String surnmame, String PESEL) {
        this.person = person;
        this.surnmame = surnmame;
        this.PESEL = PESEL;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getSurnmame() {
        return surnmame;
    }

    public void setSurnmame(String surnmame) {
        this.surnmame = surnmame;
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
                Objects.equals(surnmame, person1.surnmame) &&
                Objects.equals(PESEL, person1.PESEL);
    }

    @Override
    public String toString() {
        return "Person{" +
                "person='" + person + '\'' +
                ", surnmame='" + surnmame + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
