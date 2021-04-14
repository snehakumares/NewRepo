package mylearningphase1;

import mylearningphase1.ProjectState;

public class Student {
    private static int noofstudents=0;
    private String name;
    public boolean lowIncomeFamily;
    public boolean meritEligible;
    public int age;
    public ProjectState project;
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
    public boolean meritCumMeans(){
        return (this.meritEligible && this.lowIncomeFamily) ;
    }

    public String eligibleToVote() {
        if(this.age<18){
            return "No";
        }
        else
            return "Yes";
    }
    public String projectState(){
        String result = "";
        switch (this.project){
            case ASSIGNED: result = "Work assigned";break;
            case ONPROGRESS: result = "On progress";break;
            case COMPLETED: result = "Work completed";break;
        }
        return result;
    }
}
