import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testHello(){
        Student s1 = new Student();
        assertEquals("Hello world",s1.printHello());
    }


}
