package oops;

public class Car implements Machine{
    @Override
    public void runOrPerform() {
        System.out.println("Car is running");
    }

    @Override
    public void consumeEnergy() {
        System.out.println("Car is consuming petrol");

    }
}
