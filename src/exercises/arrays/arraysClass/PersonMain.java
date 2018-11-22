package exercises.arrays.arraysClass;

public class PersonMain {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("Michael", "Owen", "12342389"));
        database.add(new Person("Michail", "Goral", "987612321"));
        database.add(new Person("Alex", "Nickson", "13243543225"));
        database.add(new Person("Donnatan", "O'Connor", "1334323225"));

        System.out.println(database);
        database.remove(new Person("Alex", "Nickson", "13243543225"));
        System.out.println();
        System.out.println(database);
    }
}
