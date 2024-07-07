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

   public static void main(String[] args){
//       printPrimitiveDataType();
//       nonPrimitiveDataType();
       scopeOfVariables();
//       System.out.println("Hello world");
//       System.out.println("Hi  !!");
   }
}
