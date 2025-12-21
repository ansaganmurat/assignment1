package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dis(Point dest) {
        double x2 = dest.x - this.x;
        double y2 = dest.y - this.y;
        return Math.sqrt(x2 * x2 + y2 * y2);
    }

}
