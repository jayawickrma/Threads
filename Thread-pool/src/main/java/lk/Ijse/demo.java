package lk.Ijse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i=0; i<10 ;i++){
           Runnable runnable =new MyRunnable("Worker Thread :"+i);
           executorService.execute(runnable);
        }
        executorService.shutdown();
        System.out.println("success");
    }
}
