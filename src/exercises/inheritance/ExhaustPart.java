package exercises.inheritance;

public class ExhaustPart extends Part {
    private boolean europeanStandard;

    public ExhaustPart(int idNumber, String producer, String model, String series) {
        super(idNumber, producer, model, series);
    }

    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }

    @Override
    public String toString() {
        return super.toString() + " ExhaustPart{" +
                "europeanStandard=" + europeanStandard +
                '}';
    }
}
