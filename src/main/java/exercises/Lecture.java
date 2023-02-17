package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture {
    public static void main(String[] args) {


        ArrayList<String> foods = new ArrayList<>();


        foods.add("pizza");
        foods.add("Shepard's pie");
        System.out.println(foods);


        String [] otherFoods = {"kibble", "bits"};
        foods.addAll(Arrays.asList(otherFoods));
        foods.addAll(Arrays.asList("burgers", "fries"));
        System.out.println(foods);


        foods = new ArrayList<>(Arrays.asList("apple", "banana"));
        System.out.println(foods);

        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }

        for (String food : foods) {
            System.out.println(food);
        }

        System.out.println(foods.indexOf("apple"));

    }
}
