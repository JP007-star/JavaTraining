package driver;

import oops.Animal;
import oops.Dog;

public class Polymorphism {
    public static void main(String[] args) {


        Animal animal=new Animal(); // parent class
        animal.makeSound();  //Animal is making a sound

        // overriding
        Dog dog=new Dog();
        dog.makeSound();  // Dog is making a sound

        // overloading
        dog.makeSound("loudly"); // Dog is making a sound loudly



    }
}
