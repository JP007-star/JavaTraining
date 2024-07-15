public class OOPSDemo {
    public static void main(String[] args) {

        // Inheritance
        Animal blackCat=new Cat();
        blackCat.eat();
        blackCat.sleep();

        //polymorphism
        MathOperation mathOperation=new MathOperation();
        System.out.println(mathOperation.product(3,3,3));
        System.out.println(mathOperation.product(3,3));

    }
}
