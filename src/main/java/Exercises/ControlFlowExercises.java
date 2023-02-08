package Exercises;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        for(int i = 5; i < 16; i++) {
//            System.out.println(i);
//            if (i == 15) {
//                break;
//            }
//        }

//        for (int i = 2; i < 1000000; i*= i) {
//            System.out.println(i);
//            if (i == 65536) {
//                break;
//            }
//        }

        for (int i = 0; i < 100; i++) {
            if ( (i % 3 == 0) && (i % 5 == 0) ) {
                System.out.println("fizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }



    }
}
