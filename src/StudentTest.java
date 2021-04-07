import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testHello(){
        Student s1 = new Student("Abc","xyz");
        assertEquals("Hello world",s1.printHello());
    }
    @Test
    public void testGreeting(){
        Student s1 = new Student("Abc","xyz");
        assertEquals("Hello Abc xyz!",s1.greeting());
    }
    @Test
    public void testNumberStudents(){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        assertEquals(3,Student.numberOfStudents());
    }

}
