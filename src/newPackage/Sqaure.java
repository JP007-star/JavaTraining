package newPackage;

public class Sqaure implements Shape{

    @Override
    public void area(int length,int width){
        int area=length*width;
        System.out.println("Square of area : "+area);
    }
}
