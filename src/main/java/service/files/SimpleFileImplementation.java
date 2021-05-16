package service.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleFileImplementation implements ImportExportInterface {
    @Override
    public <T> void exportData(List<T> personList, String fileName) throws IOException {

        File file = new File(fileName);

        if(file.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File already exists");
        }

        //1 Tworzę strumień
        OutputStream outputStream = new FileOutputStream(file);

        //2 Zapis (write)
        for(T obj : personList){
            String textToWrite = obj.toString();
            byte[] bytesToWrite = textToWrite.getBytes();
            int bytesLength = bytesToWrite.length;
            outputStream.write(bytesToWrite, 0, bytesLength);

            String newLineToWrite = "\n";
            byte [] bytesToWriteNewLine = newLineToWrite.getBytes();
            int length = bytesToWriteNewLine.length;
            outputStream.write(bytesToWriteNewLine, 0, length);

        }

        //3 Zamknij strumień
        outputStream.close();

    }

    @Override
    public <T> List<T> importData(String fileName) throws IOException {
      List fromFile = new ArrayList();
      File file = new File(fileName);
      //1 Tworzę strumień
        InputStream stream = new FileInputStream(file);

        //2 odczytaj dane ze strumienia
        byte[] byteArray = stream.readAllBytes();
        String readedData = new String(byteArray);

        fromFile.add(readedData);

        //3 zamknij strumień
        stream.close();

        return  fromFile;
    }
}
