package collectionDEMO;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);//添加元素
        System.out.println(map);
        System.out.println(map.containsKey("a"));//判断key是否包含。。。
        System.out.println(map.containsValue(1));
        map.get("a");//通过key获取value值
        map.getOrDefault("name",null);//如果key没有值，返回默认值
//        map.merge("a","b");//
//        map.putAll("age");
        System.out.println(map.size());//长度
        System.out.println(map.isEmpty());//是否为空
//        map.clear();//清空
        System.out.println(map.keySet());//返回所有的key,是个list[a, b, c, d]
        System.out.println(map.get("c"));//根据key获取value值
        map.remove("a");//删除元素

        //遍历操作
        Set<String> keys = map.keySet();//返回值是一个set集合
        for(String key:keys){
            System.out.println(key+"="+map.get(key));
        }
    //  只能获取对应value值，不能获取key
        map.values();//返回的是value集合
        Collection<Integer> values = map.values();
        for(Integer i:values){
            System.out.println(i);
        }

        //迭代器
        Set<String> keys2 = map.keySet();//返回值是一个set集合
        Iterator<String> iterator = keys2.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+"="+map.get(key));
        }
        
        //Map.entry
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();
            System.out.println(next.getKey()+"--"+next.getValue());
        }
        //b--2
        //c--3
        //d--4

    }
}
