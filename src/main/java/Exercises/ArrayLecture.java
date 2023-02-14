package Exercises;

import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {
        int [] ages = new int[10];
        ages[0] = 42;
        ages[5] = 75;
        ages = new int[12];
        ages[11] = 25;
        System.out.println(Arrays.toString(ages));
    }
}
