package adaptor;

import org.junit.Test;
import structuralpattern.adaptor.CameraAdaptor;
import structuralpattern.adaptor.PC;
import structuralpattern.adaptor.Usb;

public class AdaptorTest {

  @Test
  public void test() {
    Usb usb = new CameraAdaptor();
    new PC().usbAccess(usb);
    System.out.println(usb);
  }

}
