package driver;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        int a=12;
        Integer a1=12;
        System.out.println(a1.doubleValue());
        float float1=34;


        double ft=10.9;
        int int1= (int) ft;
        System.out.println(int1);


        Double double3=3.5;
        System.out.println(double3.toString()+"string");

        System.out.println("Enter a integer:");
        Scanner sc=new Scanner(System.in);
        String integer=sc.next();
        System.out.println("Enter a float:");
        String decimal=sc.next();
        int integerNum=Integer.parseInt(integer);
        float decimalNum=Float.parseFloat(decimal);
        System.out.println("Integer:"+integerNum*2);
        System.out.println("Float:"+decimalNum*2);
        String num1=sc.next();
        String num2=sc.next();
        int integerNum1=Integer.parseInt(num1);
        int integerNum2=Integer.parseInt(num2);
        System.out.println("Enter the two numbers for arithmetic operation:");
        System.out.println("Addition of two numbers:"+(integerNum1+integerNum2));
        System.out.println("Subtraction of two numbers:"+(integerNum1-integerNum2));
        System.out.println("Product of two numbers:"+integerNum1*integerNum2);
        System.out.println("Division of two numbers:"+integerNum1/integerNum2);


    }


    // Exception Handling
    // Collections
}
