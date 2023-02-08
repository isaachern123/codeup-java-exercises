package Exercises;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        for(int i = 5; i < 16; i++) {
//            System.out.println(i);
//            if (i == 15) {
//                break;
//            }
//        }

//        for (int i = 2; i < 1000000; i*= i) {
//            System.out.println(i);
//            if (i == 65536) {
//                break;
//            }
//        }

//        for (int i = 0; i < 100; i++) {
//            if ( (i % 3 == 0) && (i % 5 == 0) ) {
//                System.out.println("fizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        int number = input.nextInt();
//
//
//
//        System.out.printf("      Here is your table         %n");
//
//
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %1s | %1s | %1s |%n", "NUMBER", "SQUARED", "CUBED");
//        System.out.printf("--------------------------------%n");
//
//        System.out.printf("| %01d | %01d | %01d |%n", number, "double",  64);
//        System.out.printf("| %01d | %01d | %01d |%n", "Floating", "float",   32);
//        System.out.printf("| %01d | %01d | %01d |%n", "Integral", "long",    64);
//        System.out.printf("| %01d | %01d | %01d |%n", "Integral", "int",     32);
//
//
//        System.out.printf("--------------------------------%n");

        System.out.println("What is your grade?");
        int grade = input.nextInt();

        if ((grade <= 100) && (grade >= 88)) {
            System.out.println("A");
        } else if ((grade <= 87) && (grade >= 80)) {
            System.out.println("B");
        } else if ((grade <= 79) && (grade >= 67)) {
            System.out.println("C");
        } else if ((grade <= 66) && (grade >= 60)) {
            System.out.println("D");
        } else if ((grade <= 59) && (grade >= 0)) {
            System.out.println("F");
        } else {
            System.out.println("Not Possible");
        }


        input.close();




    }
}
