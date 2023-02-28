import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CohortTest {

    Cohort emptyCohort;
    Cohort kevinCohort;
    Cohort ymirCohort;

    @Before
    public void createAndAddStudents() {
        emptyCohort = new Cohort();
        kevinCohort = new Cohort();
        ymirCohort = new Cohort();

        Student kevin = new Student(101, "Kevin");
        kevin.addGrade(100);
        kevin.addGrade(95);
        kevin.addGrade(90);

        Student tonya = new Student(102, "Tonya");
        tonya.addGrade(85);
        tonya.addGrade(80);
        tonya.addGrade(75);

        kevinCohort.addStudent(kevin);

        ymirCohort.addStudent(kevin);
        ymirCohort.addStudent(tonya);
    }

    @Test
    public void testStudentAddedToCohort() {

        assertEquals("Kevin", kevinCohort.getStudents().get(0).getName());


        Student emily = new Student(103, "Emily");
        Student madison = new Student(104, "Madison");
        Student olivia = new Student(105, "Olivia");

        ymirCohort.addStudent(emily);
        ymirCohort.addStudent(madison);
        ymirCohort.addStudent(olivia);

        assertEquals("Kevin", ymirCohort.getStudents().get(0).getName());
        assertEquals("Tonya", ymirCohort.getStudents().get(1).getName());
        assertEquals("Emily", ymirCohort.getStudents().get(2).getName());
        assertEquals("Madison", ymirCohort.getStudents().get(3).getName());
        assertEquals("Olivia", ymirCohort.getStudents().get(4).getName());

    }


    @Test
    public void testCohortListOfStudents() {

        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, kevinCohort.getStudents().size());
        assertEquals(2, ymirCohort.getStudents().size());

        assertEquals(101, kevinCohort.getStudents().get(0).getId());

        assertEquals(101, ymirCohort.getStudents().get(0).getId());
        assertEquals(102, ymirCohort.getStudents().get(1).getId());

    }

    @Test
    public void testCohortAverageGrade() {
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(),0);
        assertEquals(95, kevinCohort.getCohortAverage(),0);
        assertEquals(87.5, ymirCohort.getCohortAverage(),0);
    }



}
