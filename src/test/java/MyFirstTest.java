import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testIfNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfNameIsNotEquals() {
        String expected = "Codeup";
        String actual = "CodeUp";

        assertNotEquals(expected, actual);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
//        Object dog = new Object();
//        Object sheep = new Object();
//        Object clonedSheep = sheep;

        assertNotSame(languages, moreLanguages);
//        assertSame(languages, moreLanguages);
//        assertNotSame(sheep, dog);
//        assertSame(sheep, clonedSheep);
    }

    @Test
    public void testIfArrayIsEquals() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfTrue() {
        String language = "PHP";

        assertTrue(language.contains("H"));
    }

    @Test
    public void testIfFalse() {
        String language = "PHP";

        assertFalse(language.contains("J"));
    }

    @Test
    public void testIfNull() {
        String language = null;
        assertNull (language);
    }

    @Test
    public void testIfNotNull() {
        String language = "Java";
        assertNotNull(language);
    }

}
