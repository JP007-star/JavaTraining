import model.Cow;

public class ControlFlowDemo {




    String name="Vishnu";  //  ----> properties of class


    public  String printSampleString(){         // --> function of class
        return "Hello World";
    }




        public static void main(String[] args) {
            String str = "Hello, World!";

            String str1=new String("hello");

            boolean result = str instanceof String;
            System.out.println("Is str an instance of String? " + result);
        }





//    public static void main(String[] args) {
//
//        int num1=0;
//        int num2=2;
//        int result;
//
//
//        result=(num1==0) ?  num1+num2 :  num1-num2;
//
//        if(num1==0) {
//            result=num1+num2;
//        }
//        else{
//            result=num1-num2;
//        }
//
//        System.out.println(result);
//
//
////        Cow cow=new Cow();
////
////
////        num2+=num1;  //  ---> num2=num1+num2;
////        System.out.println(num2);
////
////
////
////
////
////
////        ControlFlowDemo controlFlowDemo=new ControlFlowDemo();   /// --> object initialisation in java
////        System.out.println(controlFlowDemo.name);
////        System.out.println(controlFlowDemo.printSampleString());
//    }
}
