package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student tonya = new Student("Tonya");
        tonya.addGrade(50);
        tonya.addGrade(55);
        tonya.addGrade(60);
        tonya.addGrade(65);
        tonya.addGrade(70);
        System.out.println(tonya.getGradeAverage());
    }

}
