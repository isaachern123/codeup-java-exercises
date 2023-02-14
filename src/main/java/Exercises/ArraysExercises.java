package Exercises;

import java.util.Arrays;

public class ArraysExercises {

    public static String[] addX(int stringLength, String[] oldArr, String newName)
    {
        int i;

        // create a new array of size n+1
        String[] newarr = new String[stringLength + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < stringLength; i++)
            newarr[i] = oldArr[i];

        newarr[stringLength] = newName;

        return newarr;
    }


    public static void main(String[] args) {

        int stringLength = 3;

        String [] Person = new String[stringLength];


        Person[0] = "Isaac";
        Person[1] = "Serina";
        Person[2] = "Charlie";
        System.out.println(Arrays.toString(Person));


        String[] newArr = addX(stringLength, Person, "ruben");
        System.out.println(Arrays.toString(newArr));

        String[] newerArr = addX(4,newArr,"Jacob");
        System.out.println(Arrays.toString(newerArr));

    }
}
