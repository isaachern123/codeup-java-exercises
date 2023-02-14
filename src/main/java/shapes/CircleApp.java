package shapes;


import util.Input;

import java.util.Scanner;



public class CircleApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Input Input = new Input();
        do {
            System.out.println("enter radius for circle");
            double newRadius = input.nextDouble();
            Circle c1 = new Circle(newRadius);
            System.out.println("this is your area " + c1.getArea());
            System.out.println("this is your circumference " + c1.getCircumference());

           boolean done = Input.yesNo("quit Y/N");
           if(done) {
               break;
           }
        }while (true);
    }

}
