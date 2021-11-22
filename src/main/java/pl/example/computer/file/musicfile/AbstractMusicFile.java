package pl.example.computer.file.musicfile;

import pl.example.computer.file.AbstractFile;
import pl.example.computer.file.FileType;

//klasa abstract nie musi impelmentowac metod, gdzyz implementacja odbedzie sie w klasach dziedziczacych po tej klasie
public  abstract  class AbstractMusicFile  extends AbstractFile implements MusicFile {

    protected String bandName;
    protected String title;

    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }


    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
