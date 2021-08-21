package ru.stqa.pft.sandbox;

public class Point {
  private final double x, y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point other) {
    return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
  }

  public static void main(String[] args) {
    Point a = new Point(0, 1);
    Point b = new Point(0, 5);
    System.out.print("Растояние между точками ");
    System.out.printf("(%.2f, %.2f) (%.2f, %.2f) = %.2f%n", a.x, a.y, b.x, b.y, Point.distance(a, b));
    Point a2 = new Point(0, 0);
    Point b2 = new Point(2, 2);
    System.out.print("Растояние между точками ");
    System.out.printf("(%.2f, %.2f) (%.2f, %.2f) = %.2f%n", a2.x, a2.y, b2.x, b2.y, a2.distance(b2));
  }
}