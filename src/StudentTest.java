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
    public void testNumberStudents() {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        assertEquals(3, Student.numberOfStudents());
    }
    @Test
    public void testCheckEligibility(){
        Student s1 = new Student();
        s1.meritEligible = true;
        s1.lowIncomeFamily = false;
        assertEquals(false,s1.meritCumMeans());
    }
    @Test
    public void testVoteEligibility(){
        Student s1 = new Student();
        s1.age = 20;
        assertEquals("Yes",s1.eligibleToVote());
    }
    @Test
    public void testStudentsloop(){
        int i;
        Student s1;
        for(i=0;i<2;i++){
            s1 = new Student();
        }
        i=0;
        while(i<2){
          s1 = new Student();
          i++;
        }
        i=0;
        do{
            s1=new Student();
            i++;
        }while(i<2);
        assertEquals(6,Student.numberOfStudents());
    }
    @Test
    public void testArray(){
        Student[] s1 = new Student[4];
        for(int i=0;i<4;i++){
            s1[i] = new Student(Integer.toString(i),"");
        }
        for(Student s:s1){
            System.out.println(s.greeting());
        }
    }
}
