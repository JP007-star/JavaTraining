import java.util.SplittableRandom;

public class Vishnu {

    /*
         components
         1) properties
         2) functions
         3) constructors
         4) getter and setter
     */



    //properties
    String color;
    String age;
    String height;


    //constructor
    public Vishnu(String color,String age,String height){
        this.color=color;
        this.age=color;
        this.height=height;
    }




    //getter
    public String getColor() {
        return color;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    public String getAge(){
        return  age;
    }

    public String getHeight(){
        return height;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    // function
    void goingToCollege(){
        System.out.println("Going to college ...!");
    }

    void attendingClass(){
        System.out.println("Attending Classes... !");
    }


    public static void main(String[] args) {
        Vishnu vishnu=new Vishnu("White","24","5.8");
        vishnu.setColor("Grey");

        System.out.println(vishnu.getColor());
    }






}


