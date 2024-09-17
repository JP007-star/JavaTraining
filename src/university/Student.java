package university;

public class Student {
    private String name;
    private String age;

    public Student(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
