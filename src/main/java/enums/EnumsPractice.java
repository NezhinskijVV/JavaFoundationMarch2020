package enums;

import java.util.Scanner;

public class EnumsPractice {

    public static void main(String[] args) {
//        for (Day day : Day.values()) {
//            System.out.println(day);
//        }

        for (Figures figure : Figures.values()) {
            System.out.println(figure.getColor());
        }

        System.out.println("Введите фигуру");
        String input = new Scanner(System.in).next();

        switch (Figures.valueOf(input.toUpperCase().trim())) {
            case TRIANGLE:
                System.out.println("треугольник");
                break;
            case RECTANGLE:
                System.out.println("прямоугольник");
                break;
            case SQUARE:
                System.out.println("квадрат");
                break;
        }

    }
}
