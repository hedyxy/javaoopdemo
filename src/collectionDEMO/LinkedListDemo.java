package collectionDEMO;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(123);
        linkedList.add(false);
        linkedList.add("abc");//与addlast一致，都是往最后插入，但是add有返回值，addlast没有返回值
        System.out.println(linkedList);
        linkedList.add(2,"new");//指定下标插入
        System.out.println(linkedList);
        linkedList.addFirst("1");//插入到第一个
        linkedList.addLast(2);//插入到最后一个
        System.out.println(linkedList);
        System.out.println(linkedList.element());//获取第一个元素，无返回值，与getfirst类似
        linkedList.get(3);//获取指定下标值
        System.out.println(linkedList.getFirst());//获取第一个值，有返回值
        linkedList.getLast();//获取最后一个值
        linkedList.offer("333");//也是添加元素
        linkedList.offerFirst(0);//往第一个里添加
        linkedList.offerLast(9);//往最后一个添加
        System.out.println(linkedList.peek());//获取第一个元素
        linkedList.poll();//也是获取元素
        System.out.println(linkedList);

        System.out.println(linkedList.pop());//栈先进后出，拿出栈低的元素，其实拿出来的是第一个位置的元素
        linkedList.push(888);//往栈里放入元素，其实放入在第一个位置位置
        System.out.println(linkedList);
//        linkedList.remove();
        linkedList.set(1,2);//修改元素
        System.out.println(linkedList);





    }
}
