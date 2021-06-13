package pl.sniegula.model;

public class A {
    private B b;

    public B getB(){
        System.out.println("Getting b");
        int secondToSleep =3;
        try {
            Thread.sleep(secondToSleep * 1000);
        }
        catch (InterruptedException ex){
            String threadName = Thread.currentThread().getName();
            System.out.println("Nieprawidłowe działanie wątku " + threadName);
            Thread.currentThread().interrupt();
        }
        return b;
    }
    public void setB(B b){
        this.b = b;
    }
}
