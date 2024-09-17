package oops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaDemo {

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,3,4,5);
        System.out.println(integerList.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get());


        Animal animal=new Animal();
    }








}
