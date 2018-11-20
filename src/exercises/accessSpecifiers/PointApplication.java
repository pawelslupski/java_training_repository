package exercises.accessSpecifiers;

import exercises.accessSpecifiers.controller.PointController;
import exercises.accessSpecifiers.point.Point;

public class PointApplication {
    public static final int ADD_X = 1;
    public static final int ADD_Y = 2;
    public static final int MINUS_X = 3;
    public static final int MINUS_Y = 4;
    public static int option;

    public static void main(String[] args) {
        Point point = new Point(0, 0);
        PointController pc = new PointController();
        System.out.println("The current point coordinates are: (" + point.getX() + ", "+ point.getY() + ")");

        option = ADD_Y;

        switch(option) {
            case ADD_X:
                pc.addX(point);
                break;
            case ADD_Y:
                pc.addY(point);
                break;
            case MINUS_X:
                pc.minusX(point);
                break;
            case MINUS_Y:
                pc.minusY(point);
                break;
            default:
                System.out.println("Choose the correct option!");
        }
        System.out.println("The current point coordinates are: (" + point.getX() + ", "+ point.getY() + ")");
    }
}
