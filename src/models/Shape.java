package models;

import java.util.ArrayList;

public class Shape {

    private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point curnt = points.get(i);
            Point next = points.get((i + 1) % points.size());
            perimeter += curnt.dis(next);
        }

        return perimeter;
    }

    public double getAverageSide() {
        if (points.size() == 0)
            return 0;
        return calculatePerimeter() / points.size();
    }

    public double getLongest() {
        double max = 0;

        for (int i = 0; i < points.size(); i++) {
            Point curnt = points.get(i);
            Point next = points.get((i + 1) % points.size());

            double dis = curnt.dis(next);
            if (dis > max) {
                max = dis;
            }
        }

        return max;
    }
}
