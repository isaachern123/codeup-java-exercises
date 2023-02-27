package exercises;

import org.apache.commons.lang3.StringUtils;

public class MavenExercises {
    public static void main(String[] args) {
        String myString = "This Is My Freaking String";
        System.out.println(StringUtils.isNumeric(myString));
        System.out.println(StringUtils.swapCase(myString));
        System.out.println(StringUtils.reverse(myString));
    }
}
