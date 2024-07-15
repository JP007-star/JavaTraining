public class Glass {


    // properties of glass
    String name;
    String material;
    String price;
    String dimension;


    //constructors of Glass
    public Glass(String name,String material,String price,String dimension){
        this.name=name;
        this.price=price;
        this.dimension=dimension;
        this.material=material;
    }


    // behaviour or function of that particular class

    public void storeWater(){
        System.out.println("Water is stored...!");
    }



    // getters and setters
    public String getDimension() {
        return dimension;
    }
    public void setDimension(String dimension){
        this.dimension=dimension;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}


