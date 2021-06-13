package pl.sniegula.model;

public class B {
    private C c;

    public C getC(){
        System.out.println("Getting c");
        return this.c;
    }

    public void setC(C c){
        this.c = c;
    }

}
