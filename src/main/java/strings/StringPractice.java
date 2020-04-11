package strings;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "Vitalik";
        String s2 = s1;

        System.out.println(s1 == s2);
        String s3 = new String("Vitalik");
        s3 = s3.intern();

        System.out.println(s3 == s1);

        String s4 = "Vitalik";
        System.out.println(s1 == s4);

        String s5 = s4.concat(" ");

        String s6 = "Vitalik ";
        s5 = s5.intern();
        System.out.println(s5 == s6);

        s5 = s5.replace('V', 'm');
        System.out.println(s5);


        String s = "5";

        for (int i = 0; i < 100_000; i++) {
            s = s + "5";
        }

        System.out.println("SB");
        String s10 = "5";
        StringBuilder stringBuilder = new StringBuilder(s10);

        for (int i = 0; i < 100_000; i++) {
             stringBuilder.append("5");
        }


    }
}
