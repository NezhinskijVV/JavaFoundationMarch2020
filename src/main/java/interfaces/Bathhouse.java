package interfaces;

import java.util.Arrays;

public class Bathhouse {
    public static void main(String[] args) {
        Man vitalik = new Man("Vitalik", 29);
        Man semen = new Man("Semen", 22);
        Man alexandr = new Man("Alexandr", 31);

        Man[] mans = new Man[]{vitalik, semen, alexandr};

        Arrays.sort(mans);
        System.out.println("Отсортированный массив: ");
        for (Man man: mans) {
            System.out.print(man.getName() + " ");
        }
    }
}
