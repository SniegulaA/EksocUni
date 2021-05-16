import model.Person;
import service.PeopleService;
import service.files.*;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.List;

public class FileExample {

    public static void main(String [] args){

        String fileName = "test5.dat";
        ImportExportInterface service = new JsonSerialization();
        //export(fileName, service);
        importData(fileName,service);
    }


    public static void importData(String fileName,ImportExportInterface service){
        try {
            List myList = service.importData(fileName);
            //W zależności od implementacji otrzymujuemy listę
            //obiektów typu String, albo listę obiektów typu Person

            for(Object s : myList){
                System.out.println(s.toString());
            }
        }
        catch (IOException |  ClassNotFoundException ex){
            ex.printStackTrace();
        }
        /*catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }*/
    }

    public static void export(String fileName,ImportExportInterface service  ){
        PeopleService peopleService = new PeopleService();
        List<Person> personsToExport = peopleService.generateExampleData();
        for(Person p : personsToExport){
            System.out.println(p.toString());
        }

        try {
            service.exportData(personsToExport, fileName);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }

        System.out.println("Zapis zakończono");
    }

}
