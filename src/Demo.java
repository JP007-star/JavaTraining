import sun.awt.PeerEvent;

import java.util.*;

public class Demo{


    public static void main(String[] args) {
        List<Integer>  list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(9);


        Iterator<Integer> iterator=list.iterator();


        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println("");


        ListIterator<Integer> listIterator=list.listIterator();


        while (listIterator.hasPrevious()){
            System.out.print(listIterator.next());
        }



        Vector<String> vector=new Vector<>();
        vector.add("Ram");
        vector.add("Rahul");



        Enumeration<String> enumeration=vector.elements();


        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


    }
}