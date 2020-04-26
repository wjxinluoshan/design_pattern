package structuralpattern.adaptor;

public class CameraAdaptor extends CameraCard implements Usb {

  public void sendDataSize(int size) {
    this.setMemorySize(size);
  }

  public void sendDataName(String name) {
    this.setBrand(name);
  }

  public CameraAdaptor getUsb() {
    return this;
  }

  @Override
  public String toString() {
    return "camere brand is "+this.getBrand()+" and memory size is "+this.getMemorySize();
  }
}
