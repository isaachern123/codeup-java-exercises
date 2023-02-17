package Grades;

import java.util.ArrayList;

public class Student {
    public String name;
    public ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }



    public String getName() {
        return name;
    };


    public void addGrade(int grade) {
        grades.add(grade);
    };


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    public double getGradeAverage() {
        if (grades.size() == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    };

}
