package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input Input = new Input();
        System.out.println("what would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view animated movies");
        System.out.println("3 - view drama movies");
        System.out.println("4 - view horror movies");
        System.out.println("5 - view scifi movies");
        int userInput = Input.getInt();
    }
}
