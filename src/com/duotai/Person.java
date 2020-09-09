package com.duotai;

public class Person {

    public void feed(Pet pet){
        pet.feed();
    }

    public  void play(Pet pet){
        pet.play();
    }

    public Pet buyPet(int type){
        if (type==1){
            return new Dog();
        }else if(type==2){
            return new Cat();
        }
        else {
            return new Penguin();
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        Pet cat = new Cat();
        Pet dog = new Dog();
        Pet penguin = new Penguin();
        p.feed(cat);
        p.feed(dog);
        p.feed(penguin);
        p.play(cat);

        Pet pet=p.buyPet(1);
        if (pet instanceof Dog){
            System.out.println("买的是狗");
        }
        else if(pet instanceof Cat){
            System.out.println("买的是猫");
        }else if (pet instanceof Penguin){
            System.out.println("买的是企鹅");
        }


    }
}
