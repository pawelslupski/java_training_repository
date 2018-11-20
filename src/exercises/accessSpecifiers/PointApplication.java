package exercises.accessSpecifiers;

import exercises.accessSpecifiers.controller.PointController;
import exercises.accessSpecifiers.point.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        PointController pc = new PointController();

        pc.addX(point);
        pc.addY(point);
        System.out.println(point.getX());
        System.out.println(point.getY());

        pc.minusX(point);
        pc.minusY(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
