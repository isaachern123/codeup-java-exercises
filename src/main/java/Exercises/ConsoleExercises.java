package Exercises;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String aName = "name";
        aName = input.nextLine();
        System.out.println("Your name is " + aName);

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);

        input.nextLine();
        System.out.println("Enter your name");
        aName = input.nextLine();
        System.out.println("Your name is " + aName);

        input.close();

    }
}
