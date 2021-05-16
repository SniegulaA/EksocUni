package service.files;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Person;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonSerialization implements ImportExportInterface {
    @Override
    public <T> void exportData(List<T> personList, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(fileName);
        mapper.writeValue(file,personList );
    }

    @Override
    public <T> List<T> importData(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        ObjectMapper mapper = new ObjectMapper();
        //Person myList = mapper.readValue(file, Person.class );
        List myList = mapper.readValue(file,  mapper.getTypeFactory().constructCollectionType(List.class, Person.class) );

        return myList;
    }
}
