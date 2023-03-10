package util;

import java.util.Scanner;

public class Input {
    private final Scanner sc;

    public Input() {
        sc = new Scanner(System.in);
    }

        // Get String
    public String getString(){
        return sc.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }


        // Yes Or No
    public boolean yesNo(){
        String response = getString();
        return response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("true");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }


    // Get Int
    public int getInt() {
        int userInt = 0;

        String s = getString();

        try {
            userInt = Integer.parseInt(s);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Integer. Please re-enter: ");
            userInt = getInt();
        }

        return userInt;
    }


    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }

    // Get Int With Parameters
    public int getInt(int min, int max){
        System.out.println("choose a number between " + min + " and " + max);
        int myNumber = getInt();
        if (myNumber >= min && myNumber <= max) {
            System.out.println("good job");
        } else {
            return getInt(min, max);
        }
        return myNumber;
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        return getInt(min, max);
    }


    // Get Double
    public double getDouble(){
        double userDouble = 0;

        String s = getString();

        try {
            userDouble = Double.parseDouble(s);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Integer. Please re-enter: ");
            userDouble = getDouble();
        }

        return userDouble;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();
    }


        // Get Double With Parameters
    public double getDouble(double min, double max){
        System.out.println("choose a number between " + min + " and " + max);
        double myNumber = getDouble();
        if (myNumber >= min && myNumber <= max) {
            System.out.println("good job");
        } else {
            return getDouble(min, max);
        }
        return myNumber;
    }

    public double getDouble(int min, int max, String prompt){
        System.out.println(prompt);
        return getDouble(min, max);
    }


    //Get Binary


    public int getBinary() {
        int userInt = 0;

        String s = getString();

        try {
            userInt = Integer.valueOf(s, 2);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Integer. Please re-enter: ");
            userInt = getBinary();
        }

        return userInt;
    }

    public int getHex() {
        int userInt = 0;

        String s = getString();

        try {
            userInt = Integer.valueOf(s, 16);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Integer. Please re-enter: ");
            userInt = getHex();
        }

        return userInt;
    }


}

