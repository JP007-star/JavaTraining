package oops;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog is making a sound");
    }

    public void makeSound(String str){
        System.out.println("Dog is making a sound "+str);
    }






}
