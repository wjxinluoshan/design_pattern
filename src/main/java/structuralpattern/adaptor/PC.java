package structuralpattern.adaptor;

public class PC {
     public void usbAccess(Usb usb){
      usb.sendDataName("sony");
      usb.sendDataSize(100);
     }
}
