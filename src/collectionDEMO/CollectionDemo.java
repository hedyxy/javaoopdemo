package collectionDEMO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection =new ArrayList();//接口不能被实例化，所以newcollection接口的子类
        collection.add(1);
        collection.add(true);
        collection.add(1.23);
        collection.add("abc");
        System.out.println(collection);
        ((ArrayList)collection).add(0,"hao");//指定下标添加元素
        System.out.println(collection);//[hao, 1, true, 1.23, abc]
        Collection collection1 = new ArrayList();//

        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        collection1.add("d");
        System.out.println(collection1);//[a, b, c, d]
        collection.addAll(collection1);//将另一个集合的元素到此集合中;[hao, 1, true, 1.23, abc, a, b, c, d]
        System.out.println(collection);
//        collection.clear();//清空集合里的元素，对象没有被回收
//        System.out.println(collection);//[]
        System.out.println(collection.contains("a"));//集合中是否包含指定的元素值      true
        System.out.println(collection.containsAll(collection1));//判断集合中是否包含另外一个集合  true
        Collection collection2 =new ArrayList();//接口不能被实例化，所以newcollection接口的子类
        collection2.add("hao");
        collection2.add(1);
        collection2.add(true);
        collection2.add(1.23);
        collection2.add("abc");
        collection2.addAll(collection1);
        System.out.println(collection.equals(collection2));//判断两个集合每个元素是否相等  ture
        System.out.println(collection.hashCode());//计算出对应的hash值  -1233236403
        System.out.println(collection.isEmpty());//判断集合是否为空  false
        System.out.println(collection.parallelStream());//jdk1.8之后添加的方法，后面讲
        System.out.println(collection.remove("a"));//删除指定元素
        System.out.println(collection);
        System.out.println(collection.removeAll(collection1));//删除与另外一个集合里相同的元素
//        System.out.println(collection.removeIf());//删除指定规则的元素
        System.out.println(collection.retainAll(collection2));//若集合中拥有另一个集合所有元素返回ture，否则返回false
        System.out.println(collection.size());//返回当前集合的大小，5
        Object[] objects = collection.toArray();//toArray把集合转换成数组
        System.out.println(Arrays.toString(objects));//打印数组
        int [] a = new int[]{1,2,3};
        System.out.println(a.toString());
        System.out.println(collection.toArray());










    }

}
