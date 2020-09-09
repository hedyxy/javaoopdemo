package com.test.extend;

public class Pet {
    private String name;
    private int age;
    private String gender;

    public Pet(){

    }
    public Pet(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }
    public String getName(){
        return this.name;
    }

    public void setName(String name ){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void play(){
        System.out.println("play。。。。。");
    }

}
