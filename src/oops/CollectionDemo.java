package oops;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // Array list --> dynamic array that can grow or shrink

//        int []array=new int[2];
//        array[0]=1;
//        array[1]=2;
//        System.out.println("Array List Demo");
//        ArrayList<String> integerArrayList=new ArrayList<>();
//        integerArrayList.add("Jp");
//        integerArrayList.add("Ram");
//        integerArrayList.add("Jack");
//
//        for (String ele:
//             integerArrayList) {
//            System.out.println(ele);
//        }
        // list will  allow duplicate values
        List<String>  stringList=new ArrayList<>();
        stringList.add("Jp");
        stringList.add("Jp");
        stringList.add("Ram");
        stringList.add("Ram");
        stringList.add("Ram");


        // set does not allow duplicate values
        Set<String> stringSet=new HashSet<>();
        stringSet.add("Jp");
        stringSet.add("Jp");
        stringSet.add("Jp");
        stringSet.add("Ram");
        stringSet.add("Ram");
        stringSet.add("Ram");


        System.out.println("Print List");
        for (String ele:
             stringList) {
            System.out.println(ele);
        }

        System.out.println("Print Set");

        for (String ele:
             stringSet) {
            System.out.println(ele);
        }


        // Map does not allow duplicate values
        /* keys are unique
           values can be duplicated
         */
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"banana");
        map.put(2,"apple");
        map.put(3,"banana");
        map.put(1,"banana");


        System.out.println(map.toString());
    }
}
