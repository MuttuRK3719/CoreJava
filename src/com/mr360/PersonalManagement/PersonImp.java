package com.mr360.PersonalManagement;

abstract class PersonImp implements Person{

    private int id;
    private  String name;
    private String email;
    public PersonImp(){

    }
    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'';
    }

    public PersonImp(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
