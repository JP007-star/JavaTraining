import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class PrintWriterDemo {


    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter size of integer array :: ");
        int size= sc.nextInt();

        int[] arr=new int[size];


        for(int i=1;i<size;i++){
            System.out.println("Enter the "+i+" element");
            arr[i]= sc.nextInt();
        }

        System.out.println("Numbers in array are ::");



        try {
            for (int i : arr) {
                System.out.print(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }




    }
}
