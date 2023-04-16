package oops;

public class Animal {

    //properties
    private String name;
    private String age;

    //default constructor
    public Animal(String name,String age) {
        this.name=name;
        this.age=age;
    }
    // no args constructors
    public  Animal(){

    }
    // custom
    public Animal(String name){
        this.name=name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}
