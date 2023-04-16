package driver;

import oops.birds.Bird;
import oops.birds.Parrot;
import oops.birds.Peacock;

public class BirdDriver {
    public static void main(String[] args) {
        Bird parrot=new Parrot();
        parrot.fly();
        Bird peacock=new Peacock();
        peacock.fly();
    }
}
