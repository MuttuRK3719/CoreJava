package com.mr360.PersonalManagement;

import java.util.Scanner;

public class UserInput {
    static PersonDetails p=Main.personDetails;
    static Scanner sc=new Scanner(System.in);
   static void ExpectingChoice(){

        int n=0;
        do{
            System.out.println("Enter the number :");
            System.out.println("Choose 1 for adding the person \n Choose 2 for updating  the person details \n Choose 3 for Displaying  the person details \n Choose 4 for deleting the person \n Choose 5 for Student details \n Choose 6 for Employee details \n  Choose 9 for Exit \n");
            n= sc.nextInt();
            switch (n){
                case 1: {
                    addPerson();
                 break;}
                case 2:updatePersonDetails();
                case 3:{
                    System.out.println("Enter the Employee Id Number: ");
                    int id=sc.nextInt();
                    System.out.println(p.displayPerson(id));
                    System.out.println("Enter any number for continue");
                    var k=sc.nextInt();
                    break;
                }
                case 4: {
                    System.out.println("Enter the Employee Id Number: ");
                    p.deletePerson(sc.nextInt());
                    break;
                }
                case 5: {
                    p.displayStudent();
                    System.out.println("Enter any number for continue");
                    var k=sc.nextInt();
                    break;
                }
                case 6: {
                    p.displayEmployee();
                    System.out.println("Enter any number for continue");
                    var k=sc.nextInt();
                    break;
                }
                default:
                    System.out.println("Enter correct choice");


            }
        }while(n!=9);
    }
    static void addPerson(){
        System.out.println("Choose  1 for student 2 for Employee");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Enter the Student id: ");
            int id=sc.nextInt();
            System.out.println("Enter the Student name: ");
            String name=sc.next();
            System.out.println("Enter the Student email: ");
            String email=sc.next();
            System.out.println("Enter the Student marks: ");
            int marks=sc.nextInt();
            Student s=new Student(id,name,email,marks);
             if(p.addPerson(s)) System.err.println("Student is added successfully");
             else System.err.println("We are not able to add the Student details");
        }
        else {
            System.out.println("Enter the Employee id: ");
            int id=sc.nextInt();
            System.out.println("Enter the Employee name: ");
            String name=sc.next();
            System.out.println("Enter the Employee email: ");
            String email=sc.next();
            Employee e=new Employee(id,name,email);
            if(p.addPerson(e)) System.err.println("Employee is added successfully");
            else System.err.println("We are not able to add the Employee details");
        }
    }
    static void updatePersonDetails(){
        System.out.println("Choose  1 for student 2 for Employee");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Enter the Student id: ");
            int id=sc.nextInt();
            System.out.println("Enter the Student name: ");
            String name=sc.next();
            System.out.println("Enter the Student email: ");
            String email=sc.next();
            System.out.println("Enter the Student marks: ");
            int marks=sc.nextInt();
            Student s=new Student(id,name,email,marks);

            if(p.updatePerson(id,s)) System.err.println("Employee is added successfully");
            else System.err.println("We are not able to add the Employee details");
    }
        else {
            System.out.println("Enter the Employee id: ");
            int id=sc.nextInt();
            System.out.println("Enter the Employee name: ");
            String name=sc.next();
            System.out.println("Enter the Employee email: ");
            String email=sc.next();
            Employee e=new Employee(id,name,email);
            if(p.updatePerson(id,e)) System.err.println("Employee is added successfully");
            else System.err.println("We are not able to add the Employee details");
        }}


}
