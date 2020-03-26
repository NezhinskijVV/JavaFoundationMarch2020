package oop;

public class Lawn {
    public static void main(String[] args) {
//        Cow zorka = new Cow();
        Talkable zorka = new Cow();
        zorka.talk();

        Eatable saintCow = new Cow();
        saintCow.eat();

//        Talkable zorka = new Talkable();

        Talkable bestZorka = new Cow();
        bestZorka.silence();
    }
}
//HW 1. equals hashCode()
//   2. интерфейсы и абстрактные классы
//   3. Swimable, Flyable  default метод, создайте поле