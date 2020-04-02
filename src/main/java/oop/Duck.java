package oop;

public class Duck implements Cloneable {
    private String name;
    private String color;
    private boolean isDrake; //селезень
    private double weight;

    public Duck(String name, String color, boolean isDrake, double weight) {
        this.name = name;
        this.color = color;
        this.isDrake = isDrake;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Duck duck = (Duck) o;

        if (isDrake != duck.isDrake) return false;
        if (Double.compare(duck.weight, weight) != 0) return false;
        if (name != null ? !name.equals(duck.name) : duck.name != null) return false;
        return color != null ? color.equals(duck.color) : duck.color == null;
    }

    @Override
    public int hashCode() {
        System.out.println("Hash code!");
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}