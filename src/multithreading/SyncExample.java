package multithreading;

public class SyncExample {


    public static void main(String[] args) {

        Counter counter=new Counter();

        Runnable runnable=new MyRunnable(){
            @Override
            public  void  run(){
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };


        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(counter.getCount());

    }
}


