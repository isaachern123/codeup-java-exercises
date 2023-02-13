package Exercises;

import java.util.Objects;
import java.util.Scanner;


public class Util {
    static Scanner input = new Scanner(System.in);

    public static boolean yesNo(String yesOrNo) {
        return yesOrNo.equals("yes") || yesOrNo.equals("Yes");
    }


    public static int getInt(int min, int max) {
        System.out.println("choose a number between " + min + " and " + max);
        int myNumber = input.nextInt();
        if (myNumber >= min && myNumber <= max) {
            System.out.println("good job");
        } else {
            return getInt(min, max);
        }
        return myNumber;
    }

    public static
    public static void main(String[] args) {
//        System.out.println(yesNo("yes"));
//        System.out.println(yesNo("no"));
        System.out.println(getInt(1, 10));
    }
}
