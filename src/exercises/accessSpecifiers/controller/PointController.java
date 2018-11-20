package exercises.accessSpecifiers.controller;

import exercises.accessSpecifiers.point.Point;

public class PointController {
    public Point addX(Point point) {
        point.setX(point.getX() + 1);
        return point;
    }

    public Point minusX(Point point) {
        point.setX(point.getX() - 1);
        return point;
    }

    public Point addY(Point point) {
        point.setY(point.getY() + 1);
        return point;
    }

    public Point minusY(Point point) {
        point.setY(point.getY() - 1);
        return point;
    }
}
