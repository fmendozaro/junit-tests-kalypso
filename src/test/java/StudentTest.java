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

    @Test
    public void testIfAddGradeWorks(){
        Student fer = new Student(1L, "Fer");
        assertEquals(0, fer.getGrades().size());
        fer.addGrade(90);
        assertEquals(1, fer.getGrades().size());
        fer.addGrade(100);
        assertEquals(2, fer.getGrades().size());

        assertEquals(90, (int) fer.getGrades().get(0));
        assertEquals(100, (int) fer.getGrades().get(1));
    }

    @Test
    public void testIfGetGradeAverageWorks(){
        Student fer = new Student(1L, "Fer");
        fer.addGrade(80);
        fer.addGrade(100);
        assertEquals(90, fer.getGradeAverage(), 0);
        fer.addGrade(60);
        assertEquals(80, fer.getGradeAverage(), 0);
    }

}