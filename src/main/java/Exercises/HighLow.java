package Exercises;

public class HighLow {

    public static void main(String[] args) {
        // 1. generate a random number
        // 2. prompt user to guess number
        // 3. validate number
        // 4. compare and contrast number

        int myNumber = (int)(Math.random() * 100) + 1;
        int userInput;
        do {

            userInput = MethodsExercise.getInteger(1, 100);

            if (userInput > myNumber) {
                System.out.println("lower");
            } else if (userInput < myNumber) {
                System.out.println("higher");
            } else {
                System.out.println("nice");
            }
        }while (userInput != myNumber);
        System.out.println("game over");
    }
}
