public class Cat extends Animal{
    String name;

    @Override
    void sleep() {
        System.out.println("Cat is sleeping!!");
    }

    public void eat(){
        System.out.println("Cat drinks milk");
    }
}
