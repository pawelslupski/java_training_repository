package exercises.staticMethods;

public class University {
    public static void main(String[] args) {
        Student s1 = new Student("Michal", "Fake", 123322);
        Student s2 = new Student("Marek", "Braksal", 555434);

        System.out.println("The current students number: " + Student.studentsNumber);
    }
}
