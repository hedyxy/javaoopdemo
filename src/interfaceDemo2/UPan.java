package interfaceDemo2;

public class UPan implements Usb {
    @Override
    public void dataTransfer(){
        System.out.println("优盘传输数据");
    }

    @Override
    public void play() {
        System.out.println("优盘在玩");

    }
}
