import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 10+2;
    }


    public static void main(String[] args) {
        MyCallable myCallable=new MyCallable();
        FutureTask<Integer> task=new FutureTask<>(myCallable);
        Thread thread=new Thread(task);
        thread.start();

        System.out.println(task);
    }
}
