package Exercises;

public class Person {

    private String name;



    public void sayHello(){
        System.out.println(name);
    }

    public Person(String name) {
        this.name = name;
    }

    //accessors


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
//
//    private String firstName;
//
//    private String lastName;
//    private String middlename;
//
//
//    public Person(String firstName, String lastName, String middlename) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.middlename = middlename;
//    }
//
//    public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }
//
//    public Person() {
//        firstName = "";
//        lastName = "";
//        middlename = "";
//    }
//
//    public static void main(String[] args) {
//        Person rick = new Person();
//        rick.firstName = "Rick";
//        rick.lastName = "Sanchez";
//        System.out.println(rick.sayHello());
//
//        Person sue = new Person();
//        sue.firstName = "Sue";
//        sue.lastName = "Smith";
//        System.out.println(sue.sayHello());
//    }
//
//    // accessors
//
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
}

