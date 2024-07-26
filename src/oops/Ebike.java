package oops;

public class Ebike implements Machine{
    @Override
    public void runOrPerform() {
        System.out.println("Ebike is running  !...");
    }

    @Override
    public void consumeEnergy() {
        System.out.println("Ebike will consume electricity...!");
    }
}
