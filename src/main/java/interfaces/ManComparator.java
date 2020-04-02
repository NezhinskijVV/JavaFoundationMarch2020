package interfaces;

import java.util.Comparator;

public class ManComparator implements Comparator<Man> {

    @Override
    public int compare(Man man1, Man man2) {
        return man1.getAge() - man2.getAge();
    }
}
