package pl.sniegula;

import pl.sniegula.runnables.Callable1;
import pl.sniegula.runnables.Runnable1;
import pl.sniegula.threads.Task1;
import pl.sniegula.threads.Task2;
import pl.sniegula.threads.Task3;

import java.util.concurrent.ForkJoinPool;


public class FirstExample {
    public static void main(String [] args) throws InterruptedException {


        System.out.println("Start program");

        /* Przykład 1 sekwencyjny
        SomeFunctions someFunctions = new SomeFunctions();
        someFunctions.dowloadFile();
        someFunctions.dowloadFile2();
        someFunctions.readDataFromUser();*/

        //Przykład 2 - za pomocą dziedziczenia po klasie Thread
        /*
        Task1 task1 = new Task1("Task 1");
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        task1.start();
        task2.start();
        task3.start();

        task3.join();
        task1.join();
        task2.join();*/


        //Przykład 3 Runnable i callable
        SomeFunctions someFunctions = new SomeFunctions();
        Thread thread1 = new Thread(new Runnable1(), "Watęk 1");
        Thread thread2 = new Thread(()-> someFunctions.dowloadFile2());
        //Thread thread3 = new Thread(new Callable1()); //Callable nie wywołamy przez Thread

        thread1.start();
        thread2.start();
        thread2.join();
        System.out.println("Stop program");

        //ForkJoinPool
        //ForkJoinPool posiada commonPool - jest to stała pula wątków współdzielona

        //ForkJoinPool
    }

}
