package exercises.equalsAndToString;

public class DataStore {
    public static final int MAX_NUMBER = 100;

    private Computer[] computers;
    private int compNumber;

    public DataStore() {
        computers = new Computer[MAX_NUMBER];
        compNumber = 0;
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[compNumber];
        for(int i = 0; i < compNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getCompNumber() {
        return compNumber;
    }

    public void setCompNumber(int compNumber) {
        this.compNumber = compNumber;
    }

    public void addComputer(Computer comp) {
        if(compNumber < MAX_NUMBER) {
            computers[compNumber] = comp;
            compNumber++;
        }
    }

    public int checkAvailability(Computer comp) {
        int found = 0;
        for (int i = 0; i < compNumber; i++) {
            if(computers[i].equals(comp)) {
                found++;
            }
        }
        return found;
    }
}
