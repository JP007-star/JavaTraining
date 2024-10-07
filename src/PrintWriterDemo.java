import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {


    public static void main(String[] args) throws IOException {



        // Way 1
        PrintWriter  printWriter=new PrintWriter("Vishnu.txt");
        printWriter.println("Hi ,Vishnu");
        printWriter.flush();


        // Way 2

        FileWriter fileWriter=new FileWriter("NewFile.txt");
        fileWriter.write("Hi , Vishnu!!");
        fileWriter.flush();


        //Way



    }
}
