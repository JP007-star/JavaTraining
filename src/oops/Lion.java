package oops;

public class Lion extends Animal{

    private String gender;

    public Lion(String name, String age) {
        super(name,age);
    }

    // default
    public Lion(String name,String age,String gender) {

        super(name,age);
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void hunt(){
        System.out.println("Lion hunting ...");
    };
}
