import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionExcercise {

    public void excercise1Set(){

        Scanner scanner = new Scanner(System.in);

        String name = "";
        Set<String> names = new HashSet<>();
        do {
            System.out.println("Podaj imię");
             name = scanner.next();
            if(!name.equals("-")) {
                names.add(name);
            }


        }while(!name.equals("-"));

        for(String n: names){
            System.out.println(n);
        }
        System.out.println("podano imion " + names.size());
    }
}
