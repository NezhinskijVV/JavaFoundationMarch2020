package collections.mapPractice;

import interfaces.Man;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Man> manHashMap = new HashMap<>();
        Man vitalik = new Man("Vitalik", 29);
        Man semen = new Man("Semen", 22);
        Man alexandr = new Man("Alexandr", 31);

        manHashMap.put("Vitalik", vitalik);
        manHashMap.put("Vitalik", semen);

        System.out.println(manHashMap.get("Vitalik").getName());

//        manHashMap.put("Semen", semen);
//        manHashMap.put("Alexandr", alexandr);
//
//        System.out.println(manHashMap.get("Vitalik").getAge());
//
//        System.out.println();
//
//        for (Map.Entry<String, Man> pair :manHashMap.entrySet()){
//            System.out.println(pair.getValue().getAge() + " " + pair.getValue().getName());
//        }
//
//        System.out.println("Key set");
//        for(String name : manHashMap.keySet()){
//            System.out.println(name + " " + manHashMap.get(name).getAge());
//        }
//
//
//        String str = "!";
//        String str2 = str.concat("good");
    }
}
