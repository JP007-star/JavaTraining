package driver;


import model.Bat;
import model.Bird;
import model.Peacock;
import model.Pigeon;

public class BirdDemo {
    public static void main(String[] args) {

        Bird peacock=new Peacock();
        Bird pigeon=new Pigeon();
        Bat bat=new Bat();


        peacock.fly();
        pigeon.eat();
        peacock.eat();
        pigeon.fly();
        bat.fly();
        bat.eat();
        bat.feed();
    }
}
