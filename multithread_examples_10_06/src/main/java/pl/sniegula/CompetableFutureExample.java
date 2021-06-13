package pl.sniegula;

import pl.sniegula.model.A;
import pl.sniegula.model.B;
import pl.sniegula.model.C;
import pl.sniegula.runnables.Callable1;
import pl.sniegula.runnables.Runnable1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompetableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Start program");

        //CompletableFuture<Integer> response = CompletableFuture.completedFuture(3);
        //int numberFromFuture = response.get();
        //System.out.println("Result " + numberFromFuture);

        /*
        SomeFunctions someFunctions = new SomeFunctions();
        ExecutorService executorsService = Executors.newFixedThreadPool(10);
        CompletableFuture future1= CompletableFuture.runAsync(new Runnable1(),executorsService);
        CompletableFuture future2= CompletableFuture.runAsync(()-> someFunctions.dowloadFile2(),executorsService);
        CompletableFuture<Integer> future3=CompletableFuture.supplyAsync(()-> someFunctions.returnValue(), executorsService);


        future3.thenAccept(p-> System.out.println(p));*/


/*
        SomeFunctions someFunctions = new SomeFunctions();
        ExecutorService executorsService = Executors.newFixedThreadPool(10);
        CompletableFuture<A> future =  CompletableFuture.supplyAsync(()-> someFunctions.calculateA(), executorsService);
        CompletableFuture<B> future2  = future.thenApply(A::getB);
        CompletableFuture<C> future3  =  future2.thenApply(B::getC);
        CompletableFuture<String> future4  = future3.thenCompose(C::getMessage2);
     */

        SomeFunctions someFunctions = new SomeFunctions();
        ExecutorService executorsService = Executors.newFixedThreadPool(10);

        /*CompletableFuture<String> future =  CompletableFuture.supplyAsync(()-> someFunctions.calculateA(), executorsService)
                .thenApply(A::getB)
                .thenApply(B::getC)
                .thenCompose(C::getMessage2);

        future.thenAccept(k-> System.out.println(k));
*/

        CompletableFuture<Integer> future  = CompletableFuture.supplyAsync(()-> someFunctions.returnValue(),executorsService);
        CompletableFuture<Integer> future2  = CompletableFuture.supplyAsync(()-> someFunctions.returnValue2(),executorsService);

        CompletableFuture<Integer> futureSum =  future.thenCombine(future2, (a,b)-> a + b);

        futureSum.thenAccept(p -> System.out.println("Wynik sumy " +p));

        executorsService.shutdown();

        System.out.println("Stop program");
    }
}
