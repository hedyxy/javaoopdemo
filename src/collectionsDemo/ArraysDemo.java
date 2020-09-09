package collectionsDemo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
//        int[] array = new int[]{1,2,3};
//        List<int[]> ints = Arrays.asList(array);
        //把数组转成list
        List<Integer> ints = Arrays.asList(1,2,3,4,5);//同上两行,把数组转成list
        System.out.println(ints);

        //list转成数组
        Object[] objects = ints.toArray();

    }
}
