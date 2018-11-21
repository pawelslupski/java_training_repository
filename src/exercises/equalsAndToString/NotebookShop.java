package exercises.equalsAndToString;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.addComputer(new Computer("Acer", 23421));
        dataStore.addComputer(new Computer("Acer", 23421));
        dataStore.addComputer(new Computer("Lenovo", 43455));
        dataStore.addComputer(new Computer("HP", 45532));
        dataStore.addComputer(new Computer("Toshiba", 54355));
        Computer compToFind = new Computer("Acer", 23421);

        System.out.println("Checking how many laptops with this parameters: " + compToFind + " are in store...");
        System.out.println(dataStore.checkAvailability(compToFind));
        System.out.println("General numbers of laptop which are currently in store...");
        for(Computer comp: dataStore.getComputers()) {
            System.out.println(comp.toString());
        }
    }
}
