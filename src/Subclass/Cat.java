package Subclass;

import interfaces.ToNumber;
import abstracts.Animal;

/**
 * Created by LongND14 on 7/13/2017.
 */
public class Cat extends Animal implements ToNumber {

    @Override public void print() {
        System.out.println("Cat's name: " + name + "\nCat's age: "+ age);
    }



    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override public int getNumber() {
        return age;
    }
}
