package collectionDEMO;

import java.util.ArrayList;
import java.util.List;

public class FanxingDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");//=new Interger(1)
        list.add("abc");
        list.add("true");
        list.add(new Person("zhangsan",12).toString());
        System.out.println(list);
        for(String iter:list ){
            System.out.println(iter);
        }

        FanXingClass<String> fxc = new FanXingClass<String>();
        fxc.setA("hedy");
        fxc.setId(1);
        fxc.show();
        FanXingClass<Integer> fxc1 = new FanXingClass<Integer>();
        fxc1.setA(32);
        fxc1.setId(1);
        fxc1.show();
        FanXingClass<Person> fxc2 = new FanXingClass<Person>();
        fxc2.setA(new Person("aaa",23));
        fxc2.setId(1);
        fxc2.show();
        System.out.println(fxc2.getA());
        fxc2.set(new Person("hh",2));


        FanXingInterface fx3 = new FanXingInterfaceImplenment();
        fx3.test2("abc");

        FanXingMethod<String> fanXingMethod = new FanXingMethod<>();
        fanXingMethod.setT("ttt");
        fanXingMethod.show(123);
        fanXingMethod.show(true);
    }
}
