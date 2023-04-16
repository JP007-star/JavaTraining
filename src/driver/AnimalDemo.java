package driver;

import oops.Animal;
import oops.Lion;

public class AnimalDemo {
    public static void main(String[] args) {

        // initializing an object
        Animal lion=new Animal("lion","23");
        Animal tiger=new Animal("tiger");
        Animal animal=new Animal();

        Lion lion1=new Lion("lion1","12");
        lion1.setGender("Male");
        lion1.hunt();



        lion.getAge();
        tiger.setAge("9");
        //Wrapper is best for type casting
        int tigerAge=Integer.parseInt(tiger.getAge());
        System.out.println("Age of the lion :"+lion.getAge());
        System.out.println("Age of the tiger:"+tigerAge);
        System.out.println("Age and Gender of lion "+lion1.getAge()+"  "+lion1.getGender());


    }
}
