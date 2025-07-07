package com.mr360.PersonalManagement;

public class Employee extends PersonImp{
    public Employee(int id, String name, String email,double salary) {
        super(id, name, email);
        this.salary=salary;
    }
    public Employee(){}
    private double salary;
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if(salary>0) this.salary=salary;
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
        System.out.println("Employee working as developer in");
    }
    public void getSalarySlip(int id){
        Company.getSalarySlip(id);
    }
}
