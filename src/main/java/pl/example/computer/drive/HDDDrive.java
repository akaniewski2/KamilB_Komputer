package pl.example.computer.drive;

import pl.example.computer.file.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive implements Drive {

    private List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);

    }

    @Override
    public void listFiles() {

        //files.forEach(System.out::println);
        files.forEach(f-> System.out.println(f.getName()));

//        for (File file: files) {
//            System.out.println(file);
//        }

    }

    @Override
    public File findFileByName(String name) {
        Optional<File> foundFile = files.stream().filter(f -> f.getName()
                .equals(name)).findFirst();

        return foundFile.orElseThrow();
    }


}
