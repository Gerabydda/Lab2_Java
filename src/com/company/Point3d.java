package com.company;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d(double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d(){
        this(0,0,0);
    }
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }
    public void setX(double val) {
        xCoord = val;
    }
    public void setY(double val) {
        yCoord = val;
    }
    public void setZ(double val) {
        zCoord = val;
    }
    public boolean sravnenie(Point3d nextPoint) {
        return (xCoord == nextPoint.getX() && yCoord == nextPoint.getY() && zCoord == nextPoint.getZ());
    }
    public double distanceTo(Point3d nextPoint) {
        return (Math.sqrt(Math.pow(xCoord - nextPoint.getX(), 2) +
                Math.pow(yCoord - nextPoint.getY(), 2) +
                Math.pow(zCoord - nextPoint.getZ(), 2)));
    }
}
