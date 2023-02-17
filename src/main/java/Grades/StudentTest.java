package Grades;

public class StudentTest {
    public static void main(String[] args) {
        Student newStudent = new Student("carlos");
        newStudent.addGrade(55);
        newStudent.addGrade(89);
        newStudent.addGrade(26);
        System.out.println(newStudent.getGradeAverage());
        System.out.println(newStudent);
    }
}
