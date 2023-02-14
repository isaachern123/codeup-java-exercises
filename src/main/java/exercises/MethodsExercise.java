package exercises;

import java.util.Scanner;

public class MethodsExercise {
    public static double addition(double n1, double n2) {
        return n1 + n2;
    }
    public static double subtraction(double n1, double n2) {
        return n1 - n2;
    }
    public static double multiplication(double n1, double n2) {
        return n1 * n2;
    }
    public static double division(double n1, double n2) {
        return n1 / n2;
    }
    public static double modulus(double n1, double n2) {
        return n1 % n2;
    }

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number between " + min + " and " + max);
        int userNum = input.nextInt();
        if(userNum >= min && userNum <= max) {
            return userNum;
        }
        System.out.println("number not between " + min + "and " + max + "enter another number");
        return getInteger(min, max);
    }

    public static long factorial(int num){
        long answer = 1;
        for(int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }

    public static long factorialRecursive(int num) {
        if(num == 1) {
            return 1;
        }
        return factorialRecursive(num - 1) * num;
    }






    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(1, 2));
//        System.out.println(multiplication(1, 2));
//        System.out.println(division(1, 2));
//        System.out.println(modulus(10, 6));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial(4));

    }

}
