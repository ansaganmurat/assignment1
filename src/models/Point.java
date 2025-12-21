package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // distance from current point to the dest point
    public double dis(Point dest) {
        double x2 = dest.x - this.x;
        double y2 = dest.y - this.y;
        return Math.sqrt(x2 * x2 + y2 * y2);
    }

}
