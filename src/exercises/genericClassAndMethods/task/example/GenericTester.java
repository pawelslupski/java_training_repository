package exercises.genericClassAndMethods.task.example;

import java.util.ArrayList;

public class GenericTester {
    public static void main(String[] args) {
        Container<Integer> integers = new Container<>();
        integers.setArray(new Integer[5]);
        integers.getArray()[0] = 5;

        Container<String> strings = new Container<>();
        strings.setArray(new String[5]);
        strings.getArray()[0] = "Bolek";
        strings.getArray()[0] = "Anita";

        ArrayList<Robot> arrayList = new ArrayList<>();
        arrayList.add(new Robot());
        displayElement(0, arrayList);

        Integer num = integers.get(0);
        String str = strings.get(0);

        System.out.println(num);
        System.out.println(str);
    }

    public static void displayElement(int index, ArrayList<? super Robot> arrayList) {
        Object element = arrayList.get(index);
        System.out.println("Element: " + element);
        System.out.println("Typ elementu: " + element.getClass().getName());
    }

//    public static <T> void displayElement(int index, ArrayList<T> arrayList) {
//        T element = arrayList.get(index);
//        System.out.println("Element: " + element);
//        System.out.println("Typ elementu: " + element.getClass().getName());
//    }
}

class Maszyna {

}

class Robot extends Maszyna {

}

class SuperRobot extends Robot {

}
