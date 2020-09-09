package collectionDEMO;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class PersonSetDemo implements Comparator<Person> {
    public static void main(String[] args) {
//        HashSet hashSet = new HashSet();
//        hashSet.add(new Person("张三",12));
//        hashSet.add(new Person("张三",12));
//        hashSet.add(new Person("赵三",13));
//        System.out.println(hashSet);

        TreeSet treeSet = new TreeSet(new PersonSetDemo());
        treeSet.add(new Person("lisi",15));
        treeSet.add(new Person("张三",16));
        treeSet.add(new Person("李四",13));
        treeSet.add(new Person("zhaoliu",10));
        System.out.println(treeSet);

    }

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge()>o2.getAge()){
            return -1;
        }
        else if(o1.getAge()<o2.getAge()) {
            return 1;
        }
        else{
            return 0;
        }

    }
}
