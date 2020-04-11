package collections.setPractice;

import java.util.*;

public class WorkWithSet {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        String ivan = "Ivan";
        stringSet.add(ivan);
        stringSet.add("Vitaliy");
        stringSet.add("Alexandr");

        for (String name : stringSet) {
            System.out.print(name + " ");
        }

        stringSet.add(ivan);

        System.out.println("\nNew Set");
        for (String name : stringSet) {
            System.out.print(name + " ");
        }

        System.out.println("\n size: " + stringSet.size());
        System.out.println(stringSet.add(ivan));

        if (stringSet.contains("Alexandr")) {
            System.out.println("Contains");
        }

        Iterator iterator = stringSet.iterator();


//        stringSet.remove(ivan);
//        for (String s : stringSet) {
////            if (s.equalsIgnoreCase(ivan)) {
////                stringSet.remove(s);
////            }
//            System.out.print(s + " ");
//        }

//        for (Iterator<String> iterator1 = stringSet.iterator(); iterator1.hasNext(); ) {
//            String s = iterator1.next();
//            if (s.equals(ivan)) {
//                iterator1.remove();
//            }
//        }


        for (String name : stringSet) {
            System.out.print(name + " ");
        }


    }
}