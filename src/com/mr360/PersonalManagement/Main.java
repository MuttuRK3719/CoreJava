package com.mr360.PersonalManagement;

import java.util.Scanner;

public class Main {
    static PersonDetails personDetails=new PersonDetails() ;
    static PersonDetails p=personDetails;
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        personDetails.addPerson(new Student(101,"muttu","muttu@gmail.com",100));
        personDetails.addPerson(new Student(102,"dhanush","dhanush@gmail.com",100));
        personDetails.addPerson(new Student(103,"Sidd","Sidd@gmail.com",100));
        personDetails.addPerson(new Student(104,"Darshan","Darshan@gmail.com",100));
        personDetails.addPerson(new Employee(201,"muttu Employee","muttu@gmail.com",100000));
        personDetails.addPerson(new Employee(202,"dhanush Employee","dhanush@gmail.com",50000));
        personDetails.addPerson(new Employee(203,"Sidd Employee","Sidd@gmail.com",65000));
        personDetails.addPerson(new Employee(204,"Darshan Employee","Darshan@gmail.com",35000));
//        System.out.println(personDetails.displayPerson(204));
//        personDetails.updatePerson(204,new Employee(204,"DharshanKumar","DharshanKumar@gmail.com"));
//        System.out.println(personDetails.displayPerson(204));
//        System.out.println(personDetails.displayPerson(101));
//        System.out.println(personDetails.deletePerson(101));
//        System.out.println(personDetails.displayPerson(101));
//        personDetails.displayEmployee();
//        personDetails.displayStudent();
//        personDetails.displayPerson(101);
//        UserInput.ExpectingChoice();
            UserInput.ExpectingChoice();
            Student s=new Student();
            s.getMarkSheet(101);
            Employee e=new Employee();
            e.getSalarySlip(201);
    }
}
