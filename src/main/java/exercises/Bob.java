package exercises;

import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Talk to Bob");
        String userText = input.nextLine();

        if (userText.endsWith("?")) {
            System.out.println("Sure.");
        } else if(userText.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userText.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("whatever.");
        }
    }
}
