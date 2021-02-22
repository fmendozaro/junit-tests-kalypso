import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentObjCanBeCreated(){
        Student fer = new Student(1L, "Fer");
        Student david = null;
        assertNull(david);
        assertNotNull(fer);
    }

    @Test
    public void testIfFieldWork(){
        Student fer = new Student(1L, "Fer");
        assertEquals(1, fer.getId());
        assertEquals("Fer", fer.getName());
        assertNotNull(fer.getGrades());

        Student david = new Student(2L, "David");
        assertNotEquals("Fer", david.getName());

    }

}