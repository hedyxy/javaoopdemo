package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("bas");
        list.add("csfsdf");
        list.add("dsfasfsd");
        Collections.addAll(list,"e","f","g");//添加元素，可以一次性添加多个元素
        System.out.println(list);
        list.sort(new Comparator<String>() {//匿名内部类
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else if(o1.length()<o2.length()){
                    return -1;

                }
                else {
                    return 0;
                }

            }
        });
        System.out.println(list);//按上边自己定义的比较器规则排序[a, e, f, g, bas, csfsdf, dsfasfsd]
        Collections.sort(list);//按字母顺序排序  [a, bas, csfsdf, dsfasfsd, e, f, g]
        System.out.println(list);

        Collections.sort(list);//排序后，下面这个查找才生效
        System.out.println(Collections.binarySearch(list,"bas"));//查找某个元素在list中的位置（下标），但需要先进行排序操作，如果不排序无法找的位置（需要手动排序）
        Collections.fill(list,"替换");//将所有元素都替换成当前写的元素[替换, 替换, 替换, 替换, 替换, 替换, 替换]
        System.out.println(list);
    }
}
