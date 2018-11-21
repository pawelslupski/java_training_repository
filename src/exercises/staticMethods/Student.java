package exercises.staticMethods;

public class Student {
    public static int studentsNumber = 0;
    private String name;
    private String surname;
    private int indexNumber;

    public Student(String name, String surname, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        studentsNumber++;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }

    public static void setStudentsNumber(int studentsNumber) {
        Student.studentsNumber = studentsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}
