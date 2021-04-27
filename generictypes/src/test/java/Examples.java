import model.CustomChild;
import model.CustomParentClass;
import model.generics.FirstGenericClass;
import model.generics.NumberGenericClass;
import model.generics.SecondGenericClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Examples {
    protected final Logger log = Logger.getLogger(getClass().getName());

    @Test
    public void firstExample(){


        List<CustomParentClass> myObjects = new ArrayList<>();
        CustomParentClass patent = new CustomParentClass();
        CustomChild child = new CustomChild();

        myObjects.add(patent);
        myObjects.add(child);


        for(int i=0; i< myObjects.size(); i++){
            CustomParentClass obj = myObjects.get(i);
            obj.parentMethod();

            if(obj instanceof CustomChild){
                CustomChild childObj = (CustomChild) obj;
                childObj.childMethod();
                System.out.println("nr obiektu dziecka na liście " + i);
            }

        }

    }

    @Test
    public void genericExample(){


        FirstGenericClass<String, Integer,String, Float, CustomChild> genericObject = new FirstGenericClass();

        String attr = genericObject.someFunction(4f);

        SecondGenericClass<CustomChild> genericObject2 = new SecondGenericClass();


    }


    @Test
    public void genericExampleMumber(){
        Integer a =5;
        Number b  = a;

        NumberGenericClass<Integer> genericA = new NumberGenericClass<>();
        //NumberGenericClass<Number> genericB = genericA; - nie da rady
    }

    @Test
    public void genericForFunctionExample(){
        Integer a = 4;
        FirstGenericClass.<Integer>someFunctionWithGeneric(a);

        String b = "text";
        FirstGenericClass.<String>someFunctionWithGeneric(b);


    }
}
