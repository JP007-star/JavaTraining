package university;

public class DriverClass {
    public static void main(String[] args) {
        University hindustan=new University();
        Department cse=new Department();
        Class classA=new Class();
        Student student=new Student();

        hindustan.setUniversityName("Hindustan");
        hindustan.setDepartment(cse);
        cse.setaClass(classA);
        classA.setStudent(student);

    }
}
