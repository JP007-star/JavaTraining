class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}



class MyObject{
    String name;

    public MyObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    protected  void finalize() throws Throwable{
        System.out.println(this.name+" is being garbage");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
//
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.increment();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.increment();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Count: " + counter.getCount());  // Should be 2000




        int[] intArray=new int[5];


        System.out.println(intArray[1]);


        for (int i=0;i< 1000000;i++){
            MyObject counter=new MyObject("grabage" +i);

        }

        System.gc();
        System.out.println("garbage");




    }
}