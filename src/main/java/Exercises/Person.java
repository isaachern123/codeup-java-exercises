package Exercises;

public class Person {

    public String firstName;

    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());

        Person sue = new Person();
        sue.firstName = "Sue";
        sue.lastName = "Smith";
        System.out.println(sue.sayHello());
    }


}

