package collectionDEMO;

public class FanXingInterfaceImplenment implements FanXingInterface<String> {
    @Override
    public String test() {
        return null;
    }

    @Override
    public void test2(String b) {
        System.out.println(b);

    }
}
