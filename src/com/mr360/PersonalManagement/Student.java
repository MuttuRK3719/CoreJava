package com.mr360.PersonalManagement;

public class Student extends PersonImp{
    private  double marks;
    public Student(int id, String name, String email,double marks) {
        super(id, name, email);
        this.marks=marks;
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
        System.out.println("Student is studing");
    }
}
