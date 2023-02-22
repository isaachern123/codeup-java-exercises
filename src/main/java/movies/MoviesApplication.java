package movies;

import util.Input;

import java.util.Arrays;

import movies.Movie;

public class MoviesApplication {

    private static Movie [] movies = MoviesArray.findAll();



    public static int getUserInput(){
        Input Input = new Input();
        System.out.println("what would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view animated movies");
        System.out.println("3 - view drama movies");
        System.out.println("4 - view horror movies");
        System.out.println("5 - view scifi movies");
        return Input.get();

    }


    private static void doChoice(int choice){
        switch (choice) {
            case 1 -> getAllMovies();
            case 2 -> getMoviesByCategory("animated");
            case 3 -> getMoviesByCategory("drama");
            case 4 -> getMoviesByCategory("horror");
            case 5 -> getMoviesByCategory("scifi");
        }
    }



    private static void getAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }

    }

    private static void getMoviesByCategory(String category) {
        for (Movie movie : movies) {
            if(movie.getCategory().equals(category)){
                System.out.println(movie);
            }
        }
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
