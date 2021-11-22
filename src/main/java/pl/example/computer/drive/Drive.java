package pl.example.computer.drive;

import pl.example.computer.file.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFileByName(String name);

}
