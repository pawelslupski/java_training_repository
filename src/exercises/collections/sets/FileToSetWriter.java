package exercises.collections.sets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class FileToSetWriter {
    public static void main(String[] args) {
        String filePath = "src/exercises/collections/sets/names.txt";

        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1.compareTo(o2));
            }
        });

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader);)
        {
            String nextLine = null;
            int lines = 0;
            while((nextLine = reader.readLine()) != null) {
                names.add(nextLine);
                lines++;
            }
            System.out.println("The number of lines in the file: " + lines);
            System.out.println("The number of names in the set: " + names.size());
            System.out.println("The first name in the set is: " +  names.first());
            System.out.println("The last name in the set is: " + names.last());
        } catch (IOException ex) {
            System.out.println("The file couldn't be opened");
        }
    }
}
