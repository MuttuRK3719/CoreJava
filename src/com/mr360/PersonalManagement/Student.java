package com.mr360.PersonalManagement;

public class Student extends PersonImp{
    private  double marks;
    public Student(int id, String name, String email,double marks) {
        super(id, name, email);
        this.marks=marks;
    }
    public Student(){

    }
    @Override
    public void checkIn(String time) {
        System.out.println("Student check In"+time);
    }
    @Override
    public void check(String time) {
        System.out.println("Student check out"+time);
    }
    void study(){
        School s=new School();
        System.out.println("Student is studing in "+s.getSchoolName()+"Located in "+s.getSchoolLocation());

    }
    void getMarkSheet(int id){
        School.getMarkSheet(id);
    }

    public double getMarks() {
        return marks;
    }
}
