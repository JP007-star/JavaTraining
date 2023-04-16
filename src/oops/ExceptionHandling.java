package oops;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two number for division");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int result=0;
        try {
            result=num1/num2;
            System.out.println("Result for Division:"+result);
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide a number by 0");
        }
        finally {
            System.out.println("You have done arithmetic operation");
        }

    }
}
