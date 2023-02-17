package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureHashMap {
    public static void main(String[] args) {


        ArrayList<String> foods = new ArrayList<>();


        foods.add("pizza");
        foods.add("Shepard's pie");
        System.out.println(foods);


        String [] otherFoods = {"kibble", "bits"};
        foods.addAll(Arrays.asList(otherFoods));
        foods.addAll(Arrays.asList("burgers", "fries"));
        System.out.println(foods);


//        foods = new ArrayList<>(Arrays.asList("apple", "banana"));
        foods = new ArrayList<>(List.of("apple", "banana"));

        System.out.println(foods);

        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }

        for (String food : foods) {
            System.out.println(food);
        }

        System.out.println(foods.indexOf("apple"));

        System.out.println(foods.contains("apple"));
        System.out.println(foods.contains("Apple"));
        System.out.println(foods.contains("butter"));


        foods.add("animal");
        System.out.println(foods);
        foods.remove("animal");
        System.out.println(foods);

    }
}
