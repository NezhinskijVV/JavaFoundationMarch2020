package listPractice;

import interfaces.Man;
import oop.Duck;

public class MyArrayListRunner {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(new Man("Alexandr", 35));
        myArrayList.add(new Duck("Drake", "white", false, 3.0));
        System.out.println(myArrayList);
//        System.out.println(myArrayList.get(2));
        myArrayList.remove(0);
        System.out.println(myArrayList);
    }
}
