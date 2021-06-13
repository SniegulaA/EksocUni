package pl.sniegula;

import pl.sniegula.model.A;
import pl.sniegula.model.B;
import pl.sniegula.model.C;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class SomeFunctions {

    public void dowloadFile(){
        System.out.println("Dowload file 1... ");
        int secondToSleep =3;
        try {
            Thread.sleep(secondToSleep * 1000);
        }
        catch (InterruptedException ex){
            String threadName = Thread.currentThread().getName();
            System.out.println("Nieprawidłowe działanie wątku " + threadName);
            Thread.currentThread().interrupt();
        }

        System.out.println("File 1 finished downloading");
    }

    public void dowloadFile2(){
        System.out.println("Dowload file 2... ");
        int secondToSleep =3;
        try {
            Thread.sleep(secondToSleep * 1000);
        }
        catch (InterruptedException ex){
            String threadName = Thread.currentThread().getName();
            System.out.println("Nieprawidłowe działanie wątku " + threadName);
            Thread.currentThread().interrupt();
        }

        System.out.println("File 2 finished downloading");
    }

    public void readDataFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = scanner.next();

        System.out.println("Nice to meet you " + name);
    }

    public int returnValue(){
        System.out.println("Calcualte");
        int secondToSleep =3;
        try {
            Thread.sleep(secondToSleep * 1000);
        }
        catch (InterruptedException ex){
            String threadName = Thread.currentThread().getName();
            System.out.println("Nieprawidłowe działanie wątku " + threadName);
            Thread.currentThread().interrupt();
        }
        System.out.println("Calculation finished");
        return 2;
    }

    public int returnValue2(){
        System.out.println("Calcualte 2...");
        int secondToSleep =3;
        try {
            Thread.sleep(secondToSleep * 1000);
        }
        catch (InterruptedException ex){
            String threadName = Thread.currentThread().getName();
            System.out.println("Nieprawidłowe działanie wątku " + threadName);
            Thread.currentThread().interrupt();
        }
        System.out.println("Calculation 2  finished");
        return 5;
    }


    public A calculateA(){
        A a = new A();
        B b = new B();
        C  c = new C();
        int secondToSleep =3;
        try {
            Thread.sleep(secondToSleep * 1000);
        }
        catch (InterruptedException ex){
            String threadName = Thread.currentThread().getName();
            System.out.println("Nieprawidłowe działanie wątku " + threadName);
            Thread.currentThread().interrupt();
        }
        b.setC(c);
        a.setB(b);
        return a;
    }



}
