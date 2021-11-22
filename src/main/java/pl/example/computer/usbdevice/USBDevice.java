package pl.example.computer.usbdevice;

public interface USBDevice {

    boolean connect();
    boolean disconnect();
    String getName();

}
