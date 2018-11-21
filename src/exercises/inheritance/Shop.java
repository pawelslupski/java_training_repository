package exercises.inheritance;

public class Shop {
    public static void main(String[] args) {
        Tire tire = new Tire(121, "Kebler", "Fentil2", "A100D", "30", 75);
        Wheel wheel = new Wheel(343, "Kebler", "Dragon21", "A104B", "34", 76);
        ExhaustPart exhaustPart = new ExhaustPart(343, "Fuyld", "ffs", "A121");

        System.out.println(tire.toString());
        System.out.println(wheel.toString());
        System.out.println(exhaustPart.toString());
    }
}
