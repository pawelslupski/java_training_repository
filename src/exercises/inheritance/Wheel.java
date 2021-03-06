package exercises.inheritance;

public class Wheel extends Part {
    private String size;
    private int width;

    public Wheel(int idNumber, String producer, String model, String series, String size, int width) {
        super(idNumber, producer, model, series);
        this.size = size;
        this.width = width;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + " Wheel{" +
                "size='" + size + '\'' +
                ", width=" + width +
                '}';
    }
}
