package pl.example.computer;

import pl.example.computer.file.File;
import pl.example.computer.file.imagefile.GIFImageFile;
import pl.example.computer.file.imagefile.JPGImageFile;
import pl.example.computer.file.musicfile.MP3MusicFile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        MP3MusicFile mp3MusicFile = new MP3MusicFile("plik.mp3", 2000, "Zespol", "Tytul Plyty", 100);
        File mp3MusicFile2 = new MP3MusicFile("plik.mp3", 2000, "Zespol", "Tytul Plyty", 100);

        System.out.println(mp3MusicFile);
        System.out.println(mp3MusicFile.getName());
        System.out.println(mp3MusicFile.getVersion());

        System.out.println(mp3MusicFile2);


        JPGImageFile jpgImageFile = new JPGImageFile("plik1.jpg", 80, 60);
        GIFImageFile gifImageFile = new GIFImageFile("plik1.gif",200);

        List<File> files = new ArrayList<>();
        files.add(jpgImageFile);
        files.add(gifImageFile);


        System.out.println("contains:"+files.contains("plik.mp3"));




        for (File file: files) {

            if (file instanceof JPGImageFile) {
                System.out.println("To plik JPG");
            } else if (file instanceof GIFImageFile) {
                System.out.println("To plik GIF");
            }

        }





        System.out.println("----------------");
        files.stream().forEach(f->f.getName());
        System.out.println("----------------");

        System.out.println(Monitor.MAX_HEIGHT);
        Monitor.MonitorStaticMethodTest();
        System.out.println(Monitor.getMaxHeight());


    }
}
