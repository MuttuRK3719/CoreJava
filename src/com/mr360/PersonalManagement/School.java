package com.mr360.PersonalManagement;

import java.util.List;

public class School {
    List<Student> studentAdmissionList=PersonDetails.studentList;
    private String schoolName;

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public String getSchoolName() {
        return schoolName;
    }

    private String schoolLocation;
    static void getMarkSheet(int id){
        School school =new School();
        for(Student student:school.studentAdmissionList){
            if(student.getId()==id){
                System.out.println(student+", marks are:"+student.getMarks()+'}');
                return ;
            }

        }
        System.out.println("No such id Student not present in school check once");
    }
}
