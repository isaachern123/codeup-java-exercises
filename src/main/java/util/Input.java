package util;

import java.util.Scanner;

public class Input {
    static Scanner input = new Scanner(System.in);


    public static String getString(){

    }

    public static boolean yesNo(){
        return yesOrNo.equals("yes") || yesOrNo.equals("Yes");
    }


    public static int getInt(int min, int max){
        System.out.println("choose a number between " + min + " and " + max);
        int myNumber = input.nextInt();
        if (myNumber >= min && myNumber <= max) {
            System.out.println("good job");
        } else {
            return getInt(min, max);
        }
        return myNumber;
    }

    public static double getDouble(double min, double max){
        System.out.println("choose a number between " + min + " and " + max);
        double myNumber = input.nextDouble();
        if (myNumber >= min && myNumber <= max) {
            System.out.println("good job");
        } else {
            return getDouble(min, max);
        }
        return myNumber;
    }





    public static void main(String[] args) {
        System.out.println(yesNo("yes"));
        System.out.println(yesNo("no"));
        System.out.println(getInt(1, 10));
        System.out.println(getDouble(1.0, 10.0));

    }
}

