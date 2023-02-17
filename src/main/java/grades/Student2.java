package grades;

import java.util.ArrayList;

public class Student2 {

    private String name;
    private ArrayList<Integer> grades;

    public Student2(String nameToAdd) {
        this.name = nameToAdd;
        this.grades = new ArrayList<>();
    }


    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        int sum = 0;
        for (Integer grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }



}
