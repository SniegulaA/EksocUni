package model.generics;

import java.util.List;

public class FirstGenericClass <Filter, T, S,U,V> {
    private T attribute;
    private List<Filter> filterList;
    private  S attribute2;

    //public static T staticAttr; - nie da rady


    public S someFunction (U param1){
        return attribute2;
    }

    public  static <Z>  int someFunctionWithGeneric(Z attr){
        return 0;
    }

    public static    int someFunctionWithWildcard(List<?> attr){
        attr.get(0);
        //attr.add("text"); nie da rady
        attr.add(null);
        return 0;

    }

    public static    void someFunctionWithWildcardUpperBOund(List<? extends Number> attr){
        //Number Integer FLoat etc są dozwolone

    }
    public static    void someFunctionWithWildcardLowerBOund(List<? super Number> attr){
        //Number lub Object są dozwolone
    }
    public static void wildcardSecond(SecondGenericClass<?> test){

    }

}
