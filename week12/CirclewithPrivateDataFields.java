package ex94;

public class CirclewithPrivateDataFields {

    private double radius = 1;
    private static int numberOf0bjects = 0;

    public CirclewithPrivateDataFields() {
        numberOf0bjects++;
    }

    public CirclewithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOf0bjects++;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public static int getNumberOf0bjects() {
        return numberOf0bjects;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}




