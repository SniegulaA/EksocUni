package pl.sniegula.threads;

import pl.sniegula.SomeFunctions;

public class Task3 extends Thread {


    public void run(){
        SomeFunctions someFunctions = new SomeFunctions();
        someFunctions.readDataFromUser();
    }
}
