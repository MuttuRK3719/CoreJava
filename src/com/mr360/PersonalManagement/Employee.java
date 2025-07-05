package com.mr360.PersonalManagement;

public class Employee extends PersonImp{
    public Employee(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void checkIn(String time) {
        System.out.println("Employee check In"+time);
    }

    @Override
    public void check(String time) {
        System.out.println("Employee check out"+time);
    }
    public void work(){
        System.out.println("Employee working as developer");
    }
}
