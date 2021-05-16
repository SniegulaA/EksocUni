package service.files;

import model.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ImportExportInterface {
    public <T> void exportData(List<T> personList, String fileName) throws IOException;
    public <T> List<T> importData(String fileName) throws IOException, ClassNotFoundException;

}
