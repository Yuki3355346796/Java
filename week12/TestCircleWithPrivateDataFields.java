package ex94;

import ex94.CirclewithPrivateDataFields;

public class TestCircleWithPrivateDataFields {
    /**
     * Main method
     */
    public static void main(String[] args) {

        CirclewithPrivateDataFields myCircle =
                new CirclewithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius" + myCircle.getRadius() + "is" + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius" + myCircle.getRadius() + "is " + myCircle.getArea());
        System.out.println("The number of objects created is" +CirclewithPrivateDataFields.getNumberOf0bjects());
    }
}
