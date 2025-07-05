package com.mr360.PersonalManagement;

import com.mr360.OOPS_Project.Product;

import java.util.ArrayList;
import java.util.List;

public class PersonDetails  {
    ArrayList<Person> personList=new ArrayList<>();
   static List<Student> studentList=new ArrayList<>();
   static List<Employee> employeeList=new ArrayList<>();

    public void displayStudent(){
        for(Student s:studentList) System.out.println(s);
    }
    public void displayEmployee(){
        for(Employee e:employeeList) System.out.println(e);
    }
    public boolean addPerson(Person p){
        personList.add(p);
        if(p instanceof Employee) employeeList.add((Employee)p);
        if(p instanceof Student)studentList.add((Student)p);
        return true;
    }
    public boolean deletePerson(int id){
    for(Person p:personList){
        PersonImp p1=(PersonImp) p;
        if(p1.getId()==id){
            personList.remove(p);
            return true;
        }
    }
        System.out.println("We not found this type of Id");
        return false;
    }
    public boolean updatePerson(int id, Person per){
    for(Person person:personList){
        PersonImp p=(PersonImp) person;
        if(p.getId()==id){
            p.setEmail(((PersonImp)(per)).getEmail());
            p.setName(((PersonImp)(per)).getName());
            return true;
        }
    }
        System.out.println("We not found this type of Id");
    return false;
    }
    public Person displayPerson(int id){
    for(Person person:personList){
        PersonImp p=(PersonImp) person;
        if(p.getId()==id){
            return person;
        }
    }
        System.out.println("We not found this type of Id");
    return null;
    }

}
