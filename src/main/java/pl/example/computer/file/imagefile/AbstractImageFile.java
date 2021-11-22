package pl.example.computer.file.imagefile;

import pl.example.computer.file.AbstractFile;
import pl.example.computer.file.File;
import pl.example.computer.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {


    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
