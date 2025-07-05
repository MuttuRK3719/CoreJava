package com.mr360.OOPS_Project;

import java.util.*;

 class ProductImp implements Product{
    private  int id;
    private String name;
    private  double price;
    public ProductImp(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    List<Product> productList=new ArrayList<>();
    public int getId() {
        return id;
    }
     public  boolean addProduct(Product p){
         if(p instanceof Laptop)
             return productList.add( p);
         return false;
     }

     public boolean removeProduct(int id){
         for(int i=0;i<productList.size();i++){
             if(((ProductImp)(productList.get(i))).getId()==id){
                 productList.remove(i);
                 return true;
             }
         }
         return false;
     }
     public boolean updateProduct(int id,ProductImp p){
         for(int i=0;i<productList.size();i++){
             if(((ProductImp)(productList.get(i))).getId()==id){
                 productList.set(i,p);
                 return true;
             }
         }
         System.out.println("Product not available");
         return false;
     }
     public boolean displayProduct(int id){
         for(int i=0;i<productList.size();i++){
             if(((ProductImp)(productList.get(i))).getId()==id){
                 System.out.println(productList.get(i));
                 return true;
             }
         }
         System.out.println("Product not available");
         return false;
     }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductImp{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
