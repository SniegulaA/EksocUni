package pl.sniegula.threads;

import pl.sniegula.SomeFunctions;

public class Task2 extends Thread {


    public void run(){
        SomeFunctions someFunctions = new SomeFunctions();
        someFunctions.dowloadFile2();
    }
}
