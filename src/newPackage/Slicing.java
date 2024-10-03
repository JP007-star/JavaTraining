package newPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: list1 = [4,5,7], list2 = [1,3,4] Output: [1,4,5,3,7 4,4]

 */
public class Slicing {

//    public ArrayList<Integer> mergeTwoLists(ListNode list1, ListNode list2) {
//        // Create an ArrayList to store the result
//        ArrayList<Integer> mergedList = new ArrayList<>();
//
//        // Traverse both lists and add the elements in sorted order
//        while (list1 != null && list2 != null) {
//            if (list1.val <= list2.val) {
//                mergedList.add(list1.val);
//                list1 = list1.next;
//            } else {
//                mergedList.add(list2.val);
//                list2 = list2.next;
//            }
//        }
//
//        // Add the remaining nodes from list1 (if any)
//        while (list1 != null) {
//            mergedList.add(list1.val);
//            list1 = list1.next;
//        }
//
//        // Add the remaining nodes from list2 (if any)
//        while (list2 != null) {
//            mergedList.add(list2.val);
//            list2 = list2.next;
//        }
//
//        return mergedList;
//    }
    public static void main(String[] args) {
        List<Integer> integerList1= new ArrayList<>();
        integerList1.add(4);
        integerList1.add(5);
        integerList1.add(7);
        List<Integer> integerList2=new ArrayList<>();
        integerList2.add(1);
        integerList2.add(3);
        integerList2.add(4);
        integerList1.addAll(1,integerList2);

        System.out.println(integerList1);
    }
}
