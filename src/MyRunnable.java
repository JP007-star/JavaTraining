public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 1 is created !..");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread1=new Thread(myRunnable);
        thread1.start();
    }
}
