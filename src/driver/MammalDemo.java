package driver;


import model.Cow;
import model.Mammal;
import model.Tiger;

public class MammalDemo {
    public static void main(String[] args) {
        Mammal tiger=new Tiger();
        Mammal cow=new Cow();
        cow.eat();
        cow.feed();
        tiger.feed();
        tiger.eat();

    }
}
