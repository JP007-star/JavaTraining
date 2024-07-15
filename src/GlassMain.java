public class GlassMain{
    public static void main(String[] args) {
        Glass juiceGlass=new Glass("juice","glass","$200","15 cms");   // initialization of Object
        juiceGlass.setDimension("25 cms");
        System.out.println(juiceGlass.getDimension());
        juiceGlass.storeWater();
    }
    
}
