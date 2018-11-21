package exercises.inheritance;

public class Part {
    private int idNumber;
    private String producer;
    private String model;
    private String series;

    public Part(int idNumber, String producer, String model, String series) {
        this.idNumber = idNumber;
        this.producer = producer;
        this.model = model;
        this.series = series;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Part{" +
                "idNumber=" + idNumber +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
