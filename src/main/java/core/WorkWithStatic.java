package core;

public class WorkWithStatic {
    public static void main(String[] args) {
//        WorkWithStatic work = new WorkWithStatic();
//        work.main(new String[0]);
//        WorkWithStatic.main(new String[0]);

        Car lamborgini = new Car("Lamborgini", "Yellow");
        System.out.println(lamborgini.getName() + " " + lamborgini.getColor());

        Car ferrari = new Car("Ferrari", "Red");
        System.out.println(ferrari.getName() + " " + ferrari.getColor());

//      lamborgini.setColor("Black");
        Car.color = "Black";


        System.out.println(lamborgini.getName() + " " + lamborgini.getColor());
        System.out.println(ferrari.getName() + " " + ferrari.getColor());

//        ferrari.name ="lamborgini"; //ошибка компиляции
//        lamborgini.name

    }
}
