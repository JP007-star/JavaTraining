package oops;

public class OuterClass {
    public static int outerClassProperty1;
    public static int outerClassProperty2;
    public int outerProperty3;

    public int getOuterProperty3() {
        return outerProperty3;
    }

    public void setOuterProperty3(int outerProperty3) {
        this.outerProperty3 = outerProperty3;
    }

    public static int getOuterClassProperty1() {
        return outerClassProperty1;
    }

    public static void setOuterClassProperty1(int outerClassProperty1) {
        OuterClass.outerClassProperty1 = outerClassProperty1;
    }

    public static int getOuterClassProperty2() {
        return outerClassProperty2;
    }

    public static void setOuterClassProperty2(int outerClassProperty2) {
        OuterClass.outerClassProperty2 = outerClassProperty2;
    }

    public OuterClass(int outerClassProperty1){
        this.outerClassProperty1=outerClassProperty1;
    }

    public OuterClass() {

    }

    public void outerClassFunction(){
        System.out.println("outerClass");
    }

    public static class InnerClass{
           public int innerClassProperty;

           public InnerClass(int innerClassProperty){
              this.innerClassProperty=innerClassProperty;
           }

        public int getInnerClassProperty() {
            return innerClassProperty;
        }

        public void setInnerClassProperty(int innerClassProperty) {
            this.innerClassProperty = innerClassProperty;
        }

        public InnerClass() {

        }

        public void InnerClassFunction(){
               System.out.println("InnerClass");
           }
    }
}
