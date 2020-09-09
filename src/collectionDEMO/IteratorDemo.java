package collectionDEMO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        for (Object i:linkedList){
            System.out.println(i);
        }
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //增强for循环
        for (Object i:list){
            System.out.println(i);
        }
    }
}
