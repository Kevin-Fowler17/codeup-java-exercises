import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testNameIsSame() {
        Student kevin = new Student(9999, "Kevin");
        assertSame("Kevin", kevin.getName());
    }

    @Test
    public void testIDIsSame() {
        Student kevin = new Student(9999L, "Kevin");
        assertEquals(9999L, kevin.getId());
    }

    @Test
    public void testGrades() {

        Integer [] numbers = {100, 95, 90};

        Student kevin = new Student(9999L, "Kevin");
        kevin.addGrade(100);
        kevin.addGrade(95);
        kevin.addGrade(90);

        assertSame(95, kevin.getGrades().get(1));
        assertSame(3, kevin.getGrades().size());
        // convert arraylist to an array to compare
        assertArrayEquals(numbers, kevin.getGrades().toArray(new Integer[numbers.length]));
        assertEquals(95, kevin.getGradeAverage(),0);

    }


}
