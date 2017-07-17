package Subclass;

import interfaces.ToNumber;
import abstracts.Animal;

/**
 * Created by LongND14 on 7/13/2017.
 */
public class Dog extends Animal implements ToNumber {

    @Override public void print() {
        System.out.println("Dog's name: " + name + "\nDog's age: "+ age);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override public int getNumber() {
        return this.age + this.name.length();
    }
}
