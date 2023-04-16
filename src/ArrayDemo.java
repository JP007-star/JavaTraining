public class ArrayDemo {


    public static void main(String[] args) {

        // array initialization traditional method
         int [] intArray=new int[5];
         intArray[0]=2;
         intArray[1]=6;
         intArray[2]=7;
         intArray[3]=8;
         intArray[4]=9;

         int [] cloneArray=intArray.clone();
        // for each for printing clone elements
        for (int element:
             cloneArray) {
            System.out.println(element);
        }

//        // for loop for storing clone elements
//        for (int i=0;i<intArray.length;i++){
//
//            cloneArray[i]=intArray[i];
//        }



//        int []array=new int[5];
//        array[0]=12;
//        array[1]=12;
//        array[2]=12;
//        array[3]=12;
//        array[4]=12;
//        System.out.println("Elements in array are:");
//        for(int i=0;i< array.length;i++){
//            System.out.println(array[i]);
//        }
    }
}
