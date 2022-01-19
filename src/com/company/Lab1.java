package com.company;
import java.util.Scanner;
public class Lab1 {
    public static Point3d enterPoints3d() {
        Scanner point = new Scanner(System.in);
        System.out.println("Enter coord: ");
        return new Point3d(point.nextInt(), point.nextInt(),  point.nextInt());
    }
    public static void main(String[] args) {
        Point3d point1 = enterPoints3d();
        Point3d point2 = enterPoints3d();
        Point3d point3 = enterPoints3d();
        if (point1.sravnenie(point2) || point1.sravnenie(point3) || point2.sravnenie(point3)) {
            System.out.println("One equals another.");
            return;
        }
        double newArea = computeArea(point1, point2, point3);
        System.out.printf("Area: %.2f\n", newArea);
    }
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a, b, c, pl;
        a = point1.distanceTo(point2);
        b = point1.distanceTo(point3);
        c = point2.distanceTo(point3);
        pl = (a + b + c) / 2;
        return Math.sqrt(pl*(pl - a)*(pl - b)*(pl - c));
    }
}
