public class Student {
    private static int noofstudents=0;
    private String name;
    public Student(String firstName,String lastName){
        this.name = firstName + " " + lastName;
        noofstudents+=1;
    }

    public Student() {
        noofstudents+=1;
        //empty
    }

    public static int numberOfStudents() {
        return noofstudents;
    }

    public String printHello() {
        return "Hello world";
    }
    public String greeting(){
        return "Hello "+this.name+"!";
    }

}
