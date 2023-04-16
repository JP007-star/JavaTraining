package driver;

import oops.OuterClass;

public class InnerClassOuterClass {
    public static void main(String[] args) {

        // Instance of Outer class
        OuterClass outerClass=new OuterClass(1);
        outerClass.outerClassFunction();
        System.out.println(outerClass.getOuterProperty3());



        // Instance of Inner class
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass(2);
        innerClass.InnerClassFunction();
        System.out.println(innerClass.getInnerClassProperty());
    }
}
