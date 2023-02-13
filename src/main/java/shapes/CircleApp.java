package shapes;


import java.util.Scanner;

import static util.Input.yesNo;

public class CircleApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter radius for circle");
        double newRadius = input.nextDouble();
        Circle c1 = new Circle(newRadius);
        System.out.println("this is your area " + c1.getArea());
        System.out.println("this is your circumference " + c1.getCircumference());
        System.out.println("do you want to make another circle? yes or no?");
        String yesNo = input.nextLine();
        yesNo(yesNo);
    }

}
