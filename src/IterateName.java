import java.util.Scanner;
public class IterateName {
    public static void main(String[] args) {

        // initialization of scanner Object
        Scanner sc=new Scanner(System.in);

        // prompt name from user
        System.out.println("Enter a your name:");

        // storing next entered String in a variable
        String name=sc.next(); // next string



        char strArray[]=name.toCharArray();


        for (int i=0;i<strArray.length;i++){
            System.out.print(strArray[i]);  // print all in same line
            System.out.println(strArray[i]);  // print all respective next line
        }




    }
}
