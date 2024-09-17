package newPackage;

public class Car {
    public String name;
    public String model;


    public Car(String name,String model){
        this.name=name;
        this.model=model;
    }





    public String driving(){
        return "Car is on the road";
    }

    public static void main(String[] args) {
        Car car=new Car("audi","x18");   //-> obj
    }
}
