package pl.example.computer.drive;

import pl.example.computer.file.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive{

    private Map<String, File> files = new HashMap<>();


    @Override
    public void addFile(File file) {
        files.put(file.getName(),file);

    }

    @Override
    public void listFiles() {

        Collection<File> fileCollection = files.values();

        fileCollection.stream().forEach(f-> System.out.println(f.getName()));

//        for (File file:fileCollection) {
//            System.out.println(file.getName());
//        }

    }

    @Override
    public File findFileByName(String name) {
        return files.get(name);
    }
}
