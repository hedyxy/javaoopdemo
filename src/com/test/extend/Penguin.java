package com.test.extend;

public class Penguin extends Pet {
//    private String name;
//    private int age;
//    private String gender;
    private String color;

    public Penguin(){

    }
    public Penguin(String name,int age,String gender,String color){
        super(name,age,gender);
        this.color=color;
    }

//    public String getName(){
//        return this.name;
//    }
//
//    public void setName(String name ){
//        this.name=name;
//    }
//
//    public int getAge(){
//        return this.age;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
//
//    public String getGender(){
//        return this.gender;
//    }
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public void play(){
        System.out.println("penguin play...");
    }

}
