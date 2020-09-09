package innerClass;

public class TestInnerClass {
    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.show();
        System.out.println(innerClassDemo.getId());
//        InnerClassDemo.InnerClass innerClass = new InnerClassDemo().new InnerClass();
//        innerClass.test();
        InnerClassDemo.InnerClass.InnerInner innerInner = new InnerClassDemo().new InnerClass().new InnerInner();

    }
}
