package com.test.extend;

public class Dog extends Pet{
//    private String name;
//    private int age;
//    private String gender;
    private String sound;
    public Dog(){

    }
    public Dog( String name,int age,String gender,String sound){
        super(name,age,gender);
        this.sound=sound;
    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public void setName(String name){
//        this.name=name;
//    }
//
//    public int getAge(){
//        return this.age;
//    }
//
//    public void  setAge( int age){
//        this.age=age;
//    }
//
//    public String getGender(){
//        return this.gender;
//    }
//
//    public void setGender(String gender){
//        this.gender=gender;
//    }

    public String getSound(){
        return this.sound;
    }

    public void setSound(){
        this.sound=sound;
    }

    public void play(){
        super.play();
        System.out.println("dog play...");
    }


}
