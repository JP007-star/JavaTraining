package oops.birds;

public interface Bird {

     default void fly(){
        System.out.println("Bird is flying");
    }
}
