package service.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinarySerializationImplementation implements ImportExportInterface {
    @Override
    public <T> void exportData(List<T> personList, String fileName) throws IOException {
        File file = new File(fileName);
        if(file.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File already exists");
        }

        OutputStream stream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);

        objectOutputStream.writeObject(personList);

        objectOutputStream.close();
        stream.close();
    }

    @Override
    public <T> List<T> importData(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        InputStream stream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(stream);

        List objectList =(ArrayList) objectInputStream.readObject();

        objectInputStream.close();
        stream.close();

        return  objectList;
    }
}
