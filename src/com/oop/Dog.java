package com.oop;

import com.test.extend.Pet;

public class Dog extends Pet {
    private String name;
    private int age;
    private String color;

    public Dog(){}
    public Dog(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void setAge(int age){
        if (age>0){
            this.age=age;
        }
        else{
            System.out.println("年龄不规范");
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }

    public void eat(){
        System.out.println("eating 骨头");
    }

    public void play(){
        System.out.println("playling");
    }
    public void show(){
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("color:"+this.color);
    }
}
