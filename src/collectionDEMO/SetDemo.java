package collectionDEMO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(123);
        set.add("abc");
        set.add(true);
        set.add(123);
        System.out.println(set);

        //循环1
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //循环2
        for (Iterator iter = set.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
        //循环3
        for (Object i:set){
            System.out.println(i);
        }
        set.addAll(set);
        set.clear();
        set.containsAll(set);
        set.isEmpty();
//        set.retainAll()
//        方法类似之前的


        TreeSet treeSet = new TreeSet();
        treeSet.add(34);
        treeSet.add(1);
        treeSet.add(66);
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(50));//返回此集合中最小元素大于或等于给定元素，如果没有返回为空
        System.out.println(treeSet);




    }
}
