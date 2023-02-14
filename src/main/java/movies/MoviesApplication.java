package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    private static Movie [] movies;



    public static int getUserInput(){
        Input Input = new Input();
        System.out.println("what would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view animated movies");
        System.out.println("3 - view drama movies");
        System.out.println("4 - view horror movies");
        System.out.println("5 - view scifi movies");
        return Input.getInt();

    }


    private static void doChoice(int choice){
        switch (choice) {
            case 1 -> getAllMovies();
            case 2 -> getAnimatedMovies();
            case 3 -> getDramaMovies();
            case 4 -> getHorrorMovies();
            case 5 -> getSciFiMovies();
        }
    }


    private static void getAllMovies() {
        System.out.println(Arrays.toString(MoviesArray.findAll()));
    }

    private static void getAnimatedMovies() {
        for (String category : MoviesArray){

        }
    }

    private static void getDramaMovies() {
    }

    private static void getHorrorMovies() {
    }

    private static void getSciFiMovies() {
    }


    public static void main(String[] args) {


        while(true){
            int choice = getUserInput();

            doChoice(choice);

            if (choice == 0){
                break;
            }

        }
    }
}
