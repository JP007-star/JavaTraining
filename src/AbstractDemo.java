import oops.Car;
import oops.Ebike;

public class AbstractDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(); //-->  stack memory --> same memory
        String str2 = new String("Vishnu");   //  -->   new obj will be created in stack

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Hi");
        stringBuffer.append("Vishnu");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder();
        str.append("New String");
        str.append("New String2");
        System.out.println(str);
        int int1 = 54;
        String string1 = String.valueOf(int1);
        if (str.equals("V")) {
            System.out.println("String has V");
        }


    }
}
