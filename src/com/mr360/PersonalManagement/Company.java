package com.mr360.PersonalManagement;

import java.util.List;

public class Company {
    List<Employee> companyEmpList=PersonDetails.employeeList;
    private String companyName="mr360";
    private String companyLocation;
    static Company c=new Company();
    public String getCompanyLocation() {
        return companyLocation;
    }
    static  void getStudents(){

        for (int i = 0; i <c.companyEmpList.size(); i++) {
            System.out.println(c.companyEmpList.get(i));
        }
    }
    public String getCompanyName() {
        return companyName;
    }
    public static void getSalarySlip(int id){

        for (Employee e :c.companyEmpList) {
            if(e.getId()==id){
                System.out.println("U can collect ur salary Slip... "+'\n'+ e +" Salary is:"+e.getSalary());
            }
        }

    }
}
