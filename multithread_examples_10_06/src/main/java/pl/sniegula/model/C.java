package pl.sniegula.model;

import java.util.concurrent.CompletableFuture;

public class C {
    public String getmessage(){
        System.out.println("Getting message");
        int secondToSleep =3;
        try {
            Thread.sleep(secondToSleep * 1000);
        }
        catch (InterruptedException ex){
            String threadName = Thread.currentThread().getName();
            System.out.println("Nieprawidłowe działanie wątku " + threadName);
            Thread.currentThread().interrupt();
        }
        return "C finished";
    }

    public CompletableFuture<String> getMessage2(){
        System.out.println("Getting message");
        int secondToSleep =3;
        try {
            Thread.sleep(secondToSleep * 1000);
        }
        catch (InterruptedException ex){
            String threadName = Thread.currentThread().getName();
            System.out.println("Nieprawidłowe działanie wątku " + threadName);
            Thread.currentThread().interrupt();
        }
        return CompletableFuture.completedFuture("C finished");
    }
}
