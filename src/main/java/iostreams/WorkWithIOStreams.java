package iostreams;

import interfaces.Man;

import java.io.*;

public class WorkWithIOStreams {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = reader.readLine();
//            System.out.println("InputString: " + input);
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = reader.readLine();
//            System.out.println("InputString: " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File file = new File("src/resources/myfile.txt");
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Beautiful string 1");
//            printWriter.println("Beautiful string 2");
//            printWriter.flush();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }


//        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/resources/myfile.txt"))) {
//            System.out.println(fileReader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
//            fileWriter.write("Privet");
//            fileWriter.newLine();
//            fileWriter.write("Privet");
//            fileWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/resources/myfile.txt"))) {
//            String input;
//            while ((input = fileReader.readLine()) != null) {
//                System.out.println(input);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        File file = new File("src/resources/myfile.txt");
//        String s = "";
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            s = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List<String> fileLines = new ArrayList<>();
//        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/resources/myfile.txt"))) {
//            String input;
//            while ((input = fileReader.readLine()) != null) {
//                fileLines.add(input);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        fileLines.add(s);
//
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            for (String line : fileLines) {
//                printWriter.println(line);
//            }
//            printWriter.flush();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        Man man = new Man("Semen", 91);

//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/resources/man.out"))) {
//            outputStream.writeObject(man);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/resources/man.out"))) {
            Man man1 = (Man) inputStream.readObject();
            System.out.println(man1.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//HW: 0. Files Path  Java 8
//    1. Объект класса User (login, password) Проставить transient на password.
// Сериализовать объект. После десериализовать объект и вывести поля login и password.
//   2. Даны 2 файла. В каждом файле содержится текст.
//    Необходимо поменять местами содержимое файлов.
//   3. Рассказать 3 способа создания объекта.
//   4. Написать свою запоминалку текста. Пользователь вводит имя файла и путь к нему.
//   Затем вводит максимум 10 предложений и все сохраняются в файле по выбранному пути.