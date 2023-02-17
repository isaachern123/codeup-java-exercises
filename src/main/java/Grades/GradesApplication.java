package Grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<String, Student>();

        // Example usage: add a new student to the HashMap
        Student alice = new Student("Alice");
        alice.addGrade(76);
        alice.addGrade(93);
        alice.addGrade(79);
        students.put("alice123", alice);

        Student jeremy = new Student("Jeremy");
        jeremy.addGrade(76);
        jeremy.addGrade(93);
        jeremy.addGrade(79);
        students.put("jeremy123", jeremy);

        Student lucas = new Student("lucas");
        lucas.addGrade(76);
        lucas.addGrade(93);
        lucas.addGrade(79);
        students.put("lucas123", lucas);

        Student justin = new Student("justin");
        justin.addGrade(76);
        justin.addGrade(93);
        justin.addGrade(79);
        students.put("justin123", justin);


        System.out.println(students);
    }
}
