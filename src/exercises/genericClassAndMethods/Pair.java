package exercises.genericClassAndMethods;

public class Pair<T, V> {
    private T tGenericField;
    private V vGenericField;

    public Pair() {
    }

    public Pair(T tGenericField, V vGenericField) {
        this.tGenericField = tGenericField;
        this.vGenericField = vGenericField;
    }

    public T gettGenericField() {
        return tGenericField;
    }

    public void settGenericField(T tGenericField) {
        this.tGenericField = tGenericField;
    }

    public V getvGenericField() {
        return vGenericField;
    }

    public void setvGenericField(V vGenericField) {
        this.vGenericField = vGenericField;
    }
}
