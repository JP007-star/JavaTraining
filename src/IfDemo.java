
// Java program to illustrate If statement without curly block
import java.util.*;

class IfDemo {
    public static void main(String args[])
    {
        // Control Statement
//        int i = 14;
//
//        if (i < 15) {
//            System.out.println("Inside If block");
//        }
//        else {
//            System.out.println("else part");
//        }

        // 10 + age
        int age =24;
        if(age >18) {
            if(age<10){
                System.out.println("You are welcome");
            }
            else {
                System.out.println("Sorry,You are not allowed");
            }
        }
        else{
            System.out.println("Sorry ,You are not adult");
        }




        // part of if block(immediate one statement after if condition)



//        System.out.println("10 is less than 15");
//        //always executes as it is outside of if block
//        // This statement will be executed
//        // as if considers one statement by default again below statement is outside of if block
//        System.out.println("I am Not in if");
    }
}