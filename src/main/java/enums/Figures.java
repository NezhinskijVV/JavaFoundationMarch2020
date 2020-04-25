package enums;

public enum Figures {
    TRIANGLE("red"), SQUARE("yellow"), RECTANGLE("green");

    private String color;

    Figures(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}