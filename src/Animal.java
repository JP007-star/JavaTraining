abstract class Animal {

// all abstract at least one abstract function  --> and all child extending from this parent need to implement its abstract method
    abstract void sleep();
    String name;


    public void eat(){
        System.out.println("Animal is eating...!");
    }
}
