package pl.sniegula.threads;

import pl.sniegula.SomeFunctions;

public class Task1 extends Thread {
    public Task1(String taksName){
        super(taksName);
    }

    public void run(){

        System.out.println("Operuję na wątku " + this.getName());

        SomeFunctions someFunctions = new SomeFunctions();
        someFunctions.dowloadFile();
    }
}
