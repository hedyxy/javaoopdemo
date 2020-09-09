package collectionDEMO;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add("a");//添加元素
        System.out.println(list);//[a, 1, true]
        System.out.println(list.get(0));//获取指定下标元素   a
        System.out.println(list.indexOf("a"));//从前往后找  返回指定元素的下标值   0
        System.out.println(list.lastIndexOf("a"));  //从后往前找找的第一个匹配的下标值 2
        list.set(0,"hao");//指定位置插入元素
        System.out.println(list);
        List list1 = list.subList(0,2);//截取list从0-2的角标的元素，顾头不顾尾
        System.out.println(list1);


    }
}
