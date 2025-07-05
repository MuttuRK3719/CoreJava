package com.mr360.OOPS_Project;

import java.util.ArrayList;

public class Laptop extends ProductImp{

    void coding(){
        System.out.println("we can code freely");
    }
    public Laptop(int id, String name, double price) {
        super(id, name, price);
    }
//    public  boolean addProduct(Product p){
//        if(p instanceof Laptop)
//            return productList.add( p);
//        return false;
//    }
//    public Laptop(int id, String name, double price) {
//        super(id, name, price);
//    }
//    public boolean removeProduct(int id){
//        for(int i=0;i<productList.size();i++){
//            if((productList.get(i)instanceof Laptop&&((ProductImp)(productList.get(i))).getId()==id)){
//                productList.remove(i);
//                return true;
//            }
//        }
//        return false;
//    }
//    public boolean updateProduct(int id,ProductImp p){
//        for(int i=0;i<productList.size();i++){
//            if((productList.get(i)instanceof Laptop&&((ProductImp)(productList.get(i))).getId()==id)){
//                productList.set(i,p);
//                return true;
//            }
//        }
//        System.out.println("Product not available");
//        return false;
//    }
//    public boolean displayProduct(int id){
//        for(int i=0;i<productList.size();i++){
//            if((productList.get(i)instanceof Laptop&&((ProductImp)(productList.get(i))).getId()==id)){
//                System.out.println(productList.get(i));
//                return true;
//            }
//        }
//        System.out.println("Product not available");
//        return false;
//    }
}
