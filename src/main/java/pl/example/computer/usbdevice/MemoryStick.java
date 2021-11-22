package pl.example.computer.usbdevice;

public class MemoryStick implements USBDevice{

    private String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Memory Stick connected");
        return true;
    }

    @Override
    public boolean disconnect() {

        if (!ejected) {
            System.out.println("Please eject Memory Stick first");
            return false;

        } else {

            System.out.println("Memory Stick disconnected");

            return true;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void  eject() {
        System.out.println("Memory Stick ejected");
        ejected = true;
    }
}
