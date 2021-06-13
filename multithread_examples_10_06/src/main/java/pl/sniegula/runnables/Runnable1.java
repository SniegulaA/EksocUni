package pl.sniegula.runnables;

import pl.sniegula.FirstExample;
import pl.sniegula.SomeFunctions;

public class Runnable1 implements Runnable {
    @Override
    public void run() {
        SomeFunctions example = new SomeFunctions();
        example.dowloadFile();
    }
}
