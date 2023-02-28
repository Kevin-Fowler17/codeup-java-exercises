import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    // takes a string that is a password, returns the hashed password
    @Test
    public void testHashPasswordEmpty() {
        assertEquals("", CodeupCrypt.hashPassword(""));
    }

    @Test
    public void testHashPasswordA() {
        assertEquals("4bc4BC", CodeupCrypt.hashPassword("abcABC"));
    }

    @Test
    public void testHashPasswordE() {
        assertEquals("33bc", CodeupCrypt.hashPassword("eEbc"));
    }

    @Test
    public void testHashPasswordI() {
        assertEquals("11bc", CodeupCrypt.hashPassword("iIbc"));
    }

    @Test
    public void testHashPasswordO() {
        assertEquals("00bc", CodeupCrypt.hashPassword("oObc"));
    }

    @Test
    public void testHashPasswordU() {
        assertEquals("99bc", CodeupCrypt.hashPassword("uUbc"));
    }

    @Test
    public void testHashPasswordAllVowels() {
        assertEquals("3d9c4t10n", CodeupCrypt.hashPassword("education"));
    }

    @Test
    public void testHashPasswordNoVowels() {
        assertEquals("bcdfghjklmnpqrstvwxyz", CodeupCrypt.hashPassword("bcdfghjklmnpqrstvwxyz"));
    }

}
