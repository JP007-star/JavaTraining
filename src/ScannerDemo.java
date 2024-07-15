import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter a account Number ::");
        String number=myObj.next();
        System.out.println("Hello "+number+"!");
        int balance=100;
        System.out.print("Enter amount debit :");// instance obj of Scanner class
        int num1=myObj.nextInt();
        int result=balance-num1;
        System.out.println("Balance:: "+result);
    }
}
