package pl.example.computer.file.musicfile;

public class MP3MusicFile extends  AbstractMusicFile {

    private int quality;

    public MP3MusicFile(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }
//
//    @Override
//    public String getName() {
//        //return super.getName();
//        return "Plik nazywa sie " +super.getName();
//    }

    //


    @Override
    public String toString() {
        return "MP3MusicFile{" +
                "bandName='" + bandName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
