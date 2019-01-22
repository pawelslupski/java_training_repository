package exercises.arrays.arraysClass.task;

import java.util.Arrays;

public class PersonDatabase {
    public static int INITIAL_SIZE = 1;
    Person[] people;
    private int emptyIndex;

    public PersonDatabase() {
        people = new Person[INITIAL_SIZE];
        emptyIndex = 0;
    }

    public void add(Person person) {
        if(emptyIndex == people.length) {
            people = Arrays.copyOf(people, people.length * 2);
        }
        people[emptyIndex] = person;
        emptyIndex++;
    }

    public void remove(Person person) {
        if (person == null)
            return;

        boolean found = false;
        int i = 0;
        while (i < people.length && (!found)) {
            if (people[i].equals(person)) {
                found = true;
                System.arraycopy(people, i + 1, people, i, people.length - i - 1);
                emptyIndex--;
            } else {
                i++;
            }
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= emptyIndex || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Wrong parameter!");
        }
        return people[index];
    }

    public int size() {
        return emptyIndex;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PersonsDatabase size: " + size());
        builder.append("\n");
        for (int i = 0; i < emptyIndex; i++) {
            builder.append(people[i].toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
