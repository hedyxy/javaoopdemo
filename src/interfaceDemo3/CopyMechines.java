package interfaceDemo3;

public class CopyMechines implements InkBox,Paper {
    @Override
    public void getWriterAndBlock() {
        System.out.println("黑白打印");

    }

    @Override
    public void getColor() {
        System.out.println("彩色打印");

    }

    @Override
    public void getA4() {
        System.out.println("A4纸");

    }

    @Override
    public void getB5() {
        System.out.println("B5纸");


    }
}
