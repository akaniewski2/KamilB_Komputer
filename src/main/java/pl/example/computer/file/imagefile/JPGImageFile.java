package pl.example.computer.file.imagefile;

import pl.example.computer.file.File;
import pl.example.computer.file.FileType;

public class JPGImageFile extends AbstractImageFile {


    private int compression;


    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage() {
        System.out.println("Displaying JPG");
    }

}
