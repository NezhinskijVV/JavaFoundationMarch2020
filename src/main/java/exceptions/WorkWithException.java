package exceptions;

public class WorkWithException {
    public static void main(String[] args) {
//        throw new RuntimeException("exception");
//        throw new IndexOutOfBoundsException();

//        int[] array = new int[2];

//        System.out.println(array[3]);
        Person person = new Person("Andrey", 3);
//        try {
//            person.setAge(-5);
//        } catch (MyException e) {
//            System.err.println("Bad age");
//            System.err.println(e.getMessage());
//            e.printStackTrace();
//        }

        Person vitya = null;
        try {
            vitya = new Person("Vitya", 3);
        } catch (MyRuntimeException e) {
            System.out.println(e.getMessage());
//            System.out.println(vitya.getName());
        } finally {
            System.out.println("Finally");
        }
    }
}
