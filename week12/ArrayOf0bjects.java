package ex96;

import ex94.CirclewithPrivateDataFields;

public class ArrayOf0bjects {

    public static void main(String[] args) {

        CirclewithPrivateDataFields[] circleArray;

        circleArray = createCircleArray();

        printCircleArray(circleArray);
    }

    public static CirclewithPrivateDataFields[] createCircleArray() {
        CirclewithPrivateDataFields[] circleArray = new CirclewithPrivateDataFields[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CirclewithPrivateDataFields(Math.random() * 10);
        }
        return circleArray;
    }

    public static void printCircleArray(CirclewithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15s\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }
    }
}