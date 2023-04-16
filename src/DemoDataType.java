public class DemoDataType {
    public static void main(String[] args) {
        // 8 data types of Java
        int myInt=0; // 4 byte
        long myLong=0L; // 8 byte
        char myChar='C'; // 2byte
        byte myByte=0; //1 byte
        boolean myBoolean=false; //1 byte
        short myShort=0; // 2 byte
        float myFloat=14.7f; // 4 byte
        double myDouble=10.5d; // 8 byte
        int newDouble= (int) myDouble;
        int newFloat=(int) myFloat;

        System.out.println(newDouble);// 8 byte
        System.out.println(newFloat); // 4 byte


//        System.out.println(myInt);
//        System.out.println(myBoolean);
//        System.out.println(myLong);
//        System.out.println(myFloat);
//        System.out.println(myDouble);
//        System.out.println(myChar);
//        System.out.println(myByte);
//        System.out.println(myShort);

    }
}
