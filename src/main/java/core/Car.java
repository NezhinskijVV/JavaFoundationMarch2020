package core;

public class Car {
    /*private*/ final String name ;
    /*private*/ static String color;
    public final static int WHEELS_COUNT = 4;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void setColor(String color) {
        this.color = color;
    }
}
