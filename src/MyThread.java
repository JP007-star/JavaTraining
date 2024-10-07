public class MyThread extends Thread{


    public void run(){

        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread.. !");
        }
        System.out.println("Thread 1 is created !...");
    }


    public static void main(String[] args) {
        MyThread thread1=new MyThread();
        thread1.start();
        thread1.setDaemon(true);
    }
}
