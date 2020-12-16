package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade = new ArrayList<>();

    public Student(String name, Integer grade){

    }

    // returns the student's name
    public String getName();
    // adds the given grade to the grades property
    public void addGrade(int grade);
    // returns the average of the students grades
    public double getGradeAverage();

    public static void main(String[] args) {
        Student student1 = new Student("Gonzalo", 95);

        System.out.println(student1.getName());
        student1.addGrade(95);
        System.out.println();
    }
}
