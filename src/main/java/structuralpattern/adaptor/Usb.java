package structuralpattern.adaptor;

public interface Usb {
    void sendDataSize(int size);
    void sendDataName(String name);
    Usb getUsb();
}
