package pl.sniegula.runnables;

import pl.sniegula.SomeFunctions;

import java.util.concurrent.Callable;

public class Callable1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        SomeFunctions someFunctions = new SomeFunctions();
        return someFunctions.returnValue();

    }
}
