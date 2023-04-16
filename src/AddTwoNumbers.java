import java.util.Scanner;
public class AddTwoNumbers {

    public static void main(String[] args)
    {
        int first_Num;
        int second_Num;
        int result;

        //initialization of Scanner obj
        Scanner input=new Scanner(System.in);


        System.out.println("Enter a first number");

        first_Num= input.nextInt();

        System.out.println("Enter a second number");

        second_Num= input.nextInt();

        result=first_Num+second_Num;
        System.out.println("Sum of two is:"+result);

    }
}
