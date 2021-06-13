package pl.sniegula;

import pl.sniegula.runnables.Callable1;
import pl.sniegula.runnables.Runnable1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsServiceExample {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        System.out.println("Start program");

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future future1 = executorService.submit(new Runnable1());
        Future<Integer> future2 = executorService.submit(new Callable1());

        //future1.get();
        future2.cancel(true);
        Integer result = future2.get();

        executorService.shutdown();

        System.out.println("Stop program");
    }
}
