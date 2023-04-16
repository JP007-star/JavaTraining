package oops.birds;

import oops.birds.Bird;

public class Parrot implements Bird {
    @Override
    public void fly() {
        System.out.println("Parrot is flying...");
    }

    public void speak(){
        System.out.println("Parrot is speaking ...");
    }
}
