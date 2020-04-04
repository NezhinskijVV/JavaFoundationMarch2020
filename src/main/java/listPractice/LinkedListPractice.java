package listPractice;

import interfaces.Man;

import java.util.ArrayList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
//        MyNode node1 = new MyNode(new Object(), null);
//        List<? extends Man> list = new ArrayList<>();

//        list.add(new Object());
//        list.add(new Man("Vitalik", 29));
//        list.add("ITsJAVA");
//
//
//        Object obj = list.get(1);
//        if (obj instanceof Man) {
//            System.out.println(((Man) obj).getName());
//        } else {
//            System.out.println("This is not Man");
//        }

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Иван");
        linkedList.add("Александр");
        linkedList.add("Дмитрий");
        linkedList.add("Александр");
        linkedList.add("Виталий");

        System.out.println(linkedList.toString());
        linkedList.remove(0);
        System.out.println(linkedList.toString());


    }
}
