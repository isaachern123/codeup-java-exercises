package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleExercises {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");




//        System.out.println("Enter your name");
//        String aName = "name";
//        aName = input.nextLine();
//        System.out.println("Your name is " + aName);
//
//        System.out.println("Enter your age: ");
//        int age = input.nextInt();
//        System.out.println("Your age is " + age);
//
//        input.nextLine();
//        System.out.println("Enter your name");
//        aName = input.nextLine();
//        System.out.println("Your name is " + aName);

//        double pi = 3.14159;
//        df.setRoundingMode(RoundingMode.DOWN);
//        System.out.println("The value of pi is approximately " + df.format(pi));

//        System.out.println("Enter a sentence");
//        String sentence = input.nextLine();
//        System.out.println(sentence);


        System.out.println("Width: ");
        double width = input.nextDouble();

        System.out.println("Length: ");
        double length = input.nextDouble();

        double area = width * length;
        double perimeter = (width * 2) + (length * 2);
        System.out.println("The area of your room is: " + area);
        System.out.println("The perimeter of your room is: " + perimeter);

        input.close();

    }
}
