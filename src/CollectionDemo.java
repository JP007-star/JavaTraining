import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {



        int[] myArray1=new int[5];
        myArray1[0]=5;
        myArray1[1]=4;
        myArray1[2]=3;
        myArray1[3]=2;
        myArray1[4]=5;
//        System.out.println("length of array :: "+myArray1.length);



        List<Integer> myListArray=new ArrayList<>();     // ---> dynamic array
        myListArray.add(1);
        myListArray.add(2);
        myListArray.add(4);
        myListArray.add(4);
        myListArray.add(4);
        myListArray.add(4);
        myListArray.remove(0);
        myListArray.clear();
        myListArray.add(6);
//        System.out.println(myListArray.contains(4));
//        System.out.println("Size of List :: "+myListArray.size());


        List<String> myArrayList=new ArrayList<>();   // class of students
        myArrayList.add("A");
        myArrayList.add("b");
        myArrayList.add("z");
        myArrayList.add("c");
        myArrayList.add("f");



        Set<String> mySet=new TreeSet<>();       // unique sorted collection elements
        mySet.addAll(myArrayList);



//        for (String str: mySet){
//            System.out.println(str);   // 1235
//        }





//        Map<Integer,String> map=new HashMap<>();  // -->   key value pair  , sort element
//        map.put(1,"Ram");
//        map.put(3,"Ram");
//        map.put(2,"Rahul");
//        map.put(4,"Raju");
//
//
//         for(String key:map.values()){
//             System.out.println(key);
//         }


        Map<String,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Z","A");
        linkedHashMap.put("A","Z");


        Queue<String> queue=new ArrayDeque<>();
        queue.add("Google");
        queue.add("Yahoo");
        System.out.println(queue.offer("Duck duck go"));  //---> add element


        System.out.println(queue.poll());    //--> remove that value and return
        System.out.println(queue.peek());    //--> remove that value and return
        System.out.println(queue.peek());    // --> null if queue
        System.out.println(queue.element());   // -> if full throw exception








//        for (String key: linkedHashMap.values()){
//            System.out.println(key);
//        }














    }
}
