package service.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedStreamImlementation implements ImportExportInterface {
    @Override
    public <T> void exportData(List<T> personList, String fileName) throws IOException {
        File file = new File(fileName);

        if(file.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File already exists");
        }

        //1 Tworzę strumień
        FileWriter outputStream = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStream);
        //2 Zapis (write)
        for(T obj : personList){
            bufferedWriter.write(obj.toString());
            bufferedWriter.newLine();
        }

        //3 Zamknij strumień
        bufferedWriter.close();
        outputStream.close();
    }

    @Override
    public <T> List<T> importData(String fileName) throws IOException {
        List fromFile = new ArrayList();
        File file = new File(fileName);
        //1 Tworzę strumień
        FileReader stream = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(stream);

        //2 odczytaj dane ze strumienia
        String line;
        line = bufferedReader.readLine();
        while (line!= null){

            fromFile.add(line);
            line = bufferedReader.readLine();

        }

        //3 zamknij strumień
        bufferedReader.close();
        stream.close();

        return  fromFile;
    }
}
