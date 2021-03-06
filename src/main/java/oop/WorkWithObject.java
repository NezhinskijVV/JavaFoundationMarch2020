package oop;

public class WorkWithObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object obj = new Object();
        System.out.println("obj.toString() = " + obj.toString());
        System.out.println("obj.getClass() = " + obj.getClass());
        obj.equals(new Object());

        Duck duck1 = new Duck("В", "white", true, 2.0);
        Duck duck2 = new Duck("В", "white", true, 2.0);
        duck1.equals(duck2);

        System.out.println(duck1);

        Duck myDuck = new Duck("Donald", "blue", true, 30.0);
        System.out.println(myDuck.clone());
    }
}
