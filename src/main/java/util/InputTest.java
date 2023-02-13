package util;

import static util.Input.*;

public class InputTest {

    public static void main(String[] args) {
        System.out.println(yesNo("yes"));
        System.out.println(yesNo("no"));
        System.out.println(getInt(1, 10));
        System.out.println(getDouble(1.0, 10.0));
    }
}
