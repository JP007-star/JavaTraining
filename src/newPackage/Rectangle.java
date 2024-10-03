package newPackage;

public class Rectangle implements Shape{
    @Override
    public void area(int length,int width){
        int area=length*width;

        System.out.println("Area of Rectangle :"+area);
    }
}
