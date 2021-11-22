package pl.example.computer;

//https://www.youtube.com/watch?v=OvY0f-IWlos

import pl.example.computer.drive.Drive;
import pl.example.computer.drive.HDDDrive;
import pl.example.computer.file.File;
import pl.example.computer.file.imagefile.GIFImageFile;
import pl.example.computer.file.imagefile.JPGImageFile;
import pl.example.computer.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {

//        Monitor monitor = new Monitor();
//        System.out.println(monitor.getResolution());
//        monitor.setLowResolution();
//        System.out.println(monitor.getResolution());


        Monitor monitor = new Monitor();
        //HDDDrive drive = new HDDDrive();
        //SSDDrive drive = new SSDDrive();

       // Computer computer = new Computer(monitor, drive);


//        drive.addFile(new File("plik1.jpg"));
//        drive.addFile(new File("plik2.jpg"));
//        drive.listFiles();


//        MemoryStick memoryStick = new MemoryStick("Penddrive");
//        Mouse mouse = new Mouse("Mysz 1");
//
//        computer.addUSBDevice(memoryStick);
//        computer.addUSBDevice(mouse);
//
//        memoryStick.eject();
//
//        computer.removeUSBDevice(memoryStick);
//        computer.removeUSBDevice(mouse);


        GIFImageFile gif1 = new GIFImageFile("name1.gif", 100);
        GIFImageFile gif2 = new GIFImageFile("name2.gif", 200);

        JPGImageFile jpg1 = new JPGImageFile("name1.jpg", 100,80);
        JPGImageFile jpg2 = new JPGImageFile("name1.jpg", 100,90);

        MP3MusicFile mp3file1 = new MP3MusicFile("plik1.mp3", 400, "The Doors", "Waiting for the sun", 100);
        MP3MusicFile mp3file2 = new MP3MusicFile("plik2.mp3", 400, "The Doors", "Soft Parade", 100);


//        SSDDrive drive = new SSDDrive();
        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(gif2);
        drive.addFile(jpg1);
        drive.addFile(jpg2);

        drive.addFile(mp3file1);
        drive.addFile(mp3file2);

        drive.listFiles();
        File file = drive.findFileByName("plik1.mp3");
        System.out.println("fileSize:"+file.getSize());


    }
}
