package oops;

public class CallByValueReference {
    public static void main(String[] args) {

        //object initialization   --->Instance of Object(reference)
        Animal animal=new Animal("LION");

        // Call by value
        System.out.println(animal.getName());  //LION


        // Call by reference
        changeName(animal);
        System.out.println(animal.getName());  //Tiger





    }

    public static void changeName(Animal animal){
        animal.setName("TIGER");
    }
}
