
import org.junit.*;
import testingpractice.Student;

import static org.junit.Assert.*;


public class StudentTest {


    @Before
    Student isaac = new Student(22,"Isaac");


    @Test
    public void testGetId() {
        assertNotNull(Student.getId());
    }
}
