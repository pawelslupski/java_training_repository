package exercises.iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("Jan", "Jan Miciula - 40 years old");
        map.put("Stefan", "Stefan Obora - 42 years old");
        map.put("Alina", "Alina Fronckowiak - 52 years old");
        map.put("Bolek", "Bolek Walesa - 57 years old");
        map.put("Teresa", "Teresa Zimna - 65 years old");

        Iterator<String> iterator = map.values().iterator();
        while(iterator.hasNext()) {
            String person = iterator.next();
            System.out.println(person);
        }
    }
}
