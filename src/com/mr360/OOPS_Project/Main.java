package com.mr360.OOPS_Project;

public class Main {
    public static void main(String[] args) {
        Laptop l1=new Laptop(100,"Dell",10000);
        Laptop l2=new Laptop(101,"Lenovo",10000);
        Laptop l3=new Laptop(102,"Hp",10000);
        Laptop l4=new Laptop(103,"Vivo Laptop",10000);
        Mobile m1=new Mobile(201,"vivo",2000);
        Mobile m2=new Mobile(202,"redmi",2000);
        Mobile m3=new Mobile(203,"one plus",2000);
        Mobile m4=new Mobile(204,"Iphone",2000);
        Product p=new Laptop(205,"Dell",10000);
        Mobile m5=new Mobile(1000,"iqee",2000);
        p.addProduct(l1);
        p.addProduct(l2);
        p.addProduct(l3);
        p.addProduct(l4);
        p.addProduct(m1);
        p.addProduct(m2);
        p.addProduct(m3);
        p.addProduct(m4);
        p.displayProduct(201);
        p.displayProduct(100);
        p.removeProduct(100);
        p.displayProduct(100);
        p.updateProduct(201,m5);
        p.displayProduct(1000);
//        ((Laptop) p).productList.add(l1);
//        ((Laptop) p).productList.add(l2);
//        ((Laptop) p).productList.add(l3);
//        ((Laptop) p).productList.add(l4);
//        ((Laptop) p).productList.add(m1);
//        ((Laptop) p).productList.add(m2);
//        ((Laptop) p).productList.add(m3);
//        ((Laptop) p).productList.add(m4);
    }
}
