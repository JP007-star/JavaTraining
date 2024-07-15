import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWord {
    static String topic="Java Course";    //  Class Variable

    public String todayTopic="Data Type"; // Instant Variable

   private static String hello(){
       return "Hello World";
   }

   private static void helloWorld(){
       System.out.println("Hello !! Vishnu");
   }

   private static void printPrimitiveDataType(){
       byte myByte = 127;           // local variables
       short myShort = 32767;
       int myInt = 10000;
       long myLong = 100000L;
       float myFloat = 10.99f;
       double myDouble = 99.99;
       char myChar = 'A';
       boolean myBool = true;

       System.out.println("Byte: " + myByte);
       System.out.println("Short: " + myShort);
       System.out.println("Int: " + myInt);
       System.out.println("Long: " + myLong);
       System.out.println("Float: " + myFloat);
       System.out.println("Double: " + myDouble);
       System.out.println("Char: " + myChar);
       System.out.println("Boolean: " + myBool);
   }

   private static void nonPrimitiveDataType(){
       int[] myArray=new int[5];      // --> initialization
       int[] secondArray={1,2,3,4};   //--> Dynamic initialization of Array
       myArray[0]=1;                  // --> Assignment
       myArray[4]=9;



       for (int i=0;i< secondArray.length;i++){
           System.out.println(i+" ---> "+secondArray[i]);
       }


       String myString="My String";
       System.out.println(myString);
   }


   public static void  scopeOfVariables(){
       System.out.println("Class Variable -->"+topic );
       String todayTopic="Data Type";
       System.out.println("LocalVariable  -->  "+todayTopic);
   }

   public static  void arimaticOperation(){
       int a=27;
       int b=5;

       int division=a/b;
       int modulus=a%b;
       System.out.println(division); //5
       System.out.println(modulus);  //2
   }

   private static void unaryOperator(){
       int x = 10;
       boolean flag = false;

       System.out.println("Unary plus: " + (+x));
       System.out.println("Unary minus: " + (-x));
       System.out.println("Increment: " + (++x));  // --> pre increment
       System.out.println("Decrement: " + (x--));  // ---> post decrement
       System.out.println("Decrement of 9: " + (x));
       System.out.println("Logical complement: " + (!flag));
   }

   public static void ternaryOperator(){
       int x=10;
       int y=9;

       int max=(x<y) ? x : y;

       boolean ram=true;

       // only ternary operator always return value

       // (condition) ? true statement : false statement

       String attendance=(ram==true)? "ram is present" : " ram is absent";


       if(ram==true){
           System.out.println("ram is present");
       }
       else {
           System.out.println("ram is absent");
       }

       System.out.println(attendance);

   }

   private static void instanceOperator(){
       String str = "Hello, World!";
       boolean resul1 = str instanceof String;
       System.out.println("Is str an instance of String? " + resul1);
   }

   public static void IterationDemo(){

       String name="Ram";


//       for(int i=0; i<5; i++){
//           System.out.println(name);
//       }

//       for(interation variable initialization;  condition; increment/decrement){
//
//       }

//       while (condition){
//           // block of statement
//           // increment/decrement
//       }

//       do{
//           // block statement
//           // increment/decrement
//
//       }
//       while (condition)

       int count=10; //9 //8 //7 //6 //5


//       do {
//           System.out.println(name);
//           count--;
//       }
//       while (count>5);

       int[] values={1,2,3,4,8,6,7,8,9}  ;

       for(int i: values){

           if(i==8){
               continue;
           }
           System.out.println(i);
       }




   }


   public static void ExceptionHandling() throws NullPointerException {
       int num1=5;
       int num2=0;
       int result;
       File file = null;


       try {
           result = num1 / num2;
           file=new File("text.txt");

       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
       } finally {
           System.out.println("some statement executed");
       }

       if(!file.exists()) {
           throw new NullPointerException("exception occurred !!");
       }


   }


   public static void main(String[] args) throws NullPointerException {
//       printPrimitiveDataType();
//       nonPrimitiveDataType();
//       scopeOfVariables();
//       System.out.println("Hello world");
//       System.out.println("Hi  !!");
      ExceptionHandling();
  }
}
