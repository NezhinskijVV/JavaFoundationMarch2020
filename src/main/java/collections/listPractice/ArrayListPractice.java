package collections.listPractice;

import interfaces.Man;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Man> myList = new ArrayList<>();
        Man vitalik = new Man("Vitalik", 29);
        Man semen = new Man("Semen", 22);
        Man alexandr = new Man("Alexandr", 31);

        myList.add(vitalik);
        myList.add(semen);
        myList.add(alexandr);

        for (Man man : myList) {
            System.out.print(man.getName() + " ");
        }

        System.out.println();
        System.out.println("myList.size() = " + myList.size());

        System.out.println(myList.contains(vitalik));
        System.out.println(myList.isEmpty());

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i).getAge() + " ");
        }
    }
}