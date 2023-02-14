package Exercises;

public class ServerNameGenerator {
    static String[] adjectives = {"bad", "amused", "average", "difficult", "cute", "innocent", "homely", "frightened", "selfish", "witty"};
    static String[] nouns = {"person", "place", "thing", "man", "woman", "home", "office", "town", "table", "car"};

    public static String getRandomString(String[] arr){
        int min = 0; // Minimum value of range
        int max = 10;

        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return arr[random_int];

    }

    public static void main(String[] args) {
        System.out.println(getRandomString(adjectives));
        System.out.println(getRandomString(nouns));
    }


}
