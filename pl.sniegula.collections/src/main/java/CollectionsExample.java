import java.util.*;

public class CollectionsExample {
    public static void main(String [] args){

    }

    public static void mapExample(){
        Map <String, Integer> myFirstMap = new HashMap<>(); //Zamień HashMap na TreeMap, jeżeli chcesz przechować klucze w kolejości alfabetycznej
        myFirstMap.put("A", 1);
        myFirstMap.put("A", 3); //Nadpisze dodaną 1 z poprzedniego wiersza
        myFirstMap.put("B", 4);
        myFirstMap.put("Z",4);
        myFirstMap.put("C", 5);

        //Pobież element ze słownika (MAP) po kluczu
        if(myFirstMap.containsKey("A")){
            Integer value = myFirstMap.get("A");
            System.out.println(value);
        }


        //Iteruj po zbiorze kluczy
        for(String temp :   myFirstMap.keySet()){
            Integer value = myFirstMap.get(temp);
            System.out.println("key " + temp + " value " + value);
        }

        //Iteruj po zbiorze wartości
        for(Integer temp :   myFirstMap.values()){
            System.out.println("Value " + temp);
        }
        //Iteruj po parach klucz wartość
        for(Map.Entry<String,Integer> temp : myFirstMap.entrySet()){
            String key= temp.getKey();
            Integer value = temp.getValue();
            System.out.println("key " + key + " value " + value);
        }
    }



    public static void setExample(){

        Set<Integer> myFirstSet = new TreeSet<>(); //TreeSet uporządkuje nam wystąpienia w domyślnej kolejności (metoda compareTo)
        myFirstSet.add(2);
        myFirstSet.add(3);
        myFirstSet.add(2); //Ta 2 nie doda się po taz drugi, gdyż set nie zawiera duplikatów
        for(int a : myFirstSet){
            System.out.println(a);
        }


        Set<TestClass>  mySecondSet = new HashSet<>();
        //Klasa własna, której obiekty przechowujemy w zbiorze (Set) powinna implementować metody
        //hashCode
        //toString
        //w celu zapewnienia niepowtażalności obiektów w zbiorze
        TestClass test1 = new TestClass();
        test1.setA(1);

        TestClass test2 = new TestClass();
        test2.setA(1);
        mySecondSet.add(test1);
        mySecondSet.add(test2);
        for(TestClass t : mySecondSet){
            System.out.println(t);
        }





        CollectionExcercise excercise = new CollectionExcercise();
        excercise.excercise1Set();
    }


    public static void listExample(){

        //Tablice
        int[] myFirstArray = new int[5];
        myFirstArray[0] = 4;
        myFirstArray[4] =5;
        int numberFromArray = myFirstArray[0];


        //Listy
        List<Integer> myFirstList = new LinkedList<>();
        //Dodawanie
        myFirstList.add(3);
        myFirstList.add(3);
        myFirstList.add(6);
        //Pobieranie
        myFirstList.get(0);
        //Długość
        myFirstList.size();
        //Iteracja po wszystkich
        for(int i=0; i<   myFirstList.size(); i++){
            System.out.println(myFirstList.get(i));
        }
        for (int a : myFirstList){
            System.out.println(a);
        }

    }

}
