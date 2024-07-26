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


//        System.out.println(str.trim().equals(str2));
        int int1 = 54;

        String string1 = String.valueOf(int1);
//        System.out.println(string1.contains("56"));

        double money = (double) int1;
//        System.out.println(money);


//        System.out.println(int1);


////       str2="Vishnu";
//
//        System.out.println(str);
//        System.out.println(str2);
//        System.out.println(str.length());
//        System.out.println(str.charAt(str.length() - 1));
//        System.out.println(str.equals(str2));
//        System.out.println(str.contains("y"));


        if (str.equals("V")) {
            System.out.println("String has V");
        }


    }
}
