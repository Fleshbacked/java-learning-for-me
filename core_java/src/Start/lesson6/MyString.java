package Start.lesson6;

import java.util.Arrays;

public class MyString {
    public static void main(String[] args) {
        String text = "hello world";

        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        String lower = text.toLowerCase();
        System.out.println(lower);

        int length = text.length();
        System.out.println(length);

        String repeat = text.repeat(12);
        System.out.println(repeat);

        String names = "Yori;Sanya;Gleb";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        String text1 = "Иба Четка";
        String[] array = text1.substring(4).toLowerCase().split(" ");
        for (String word : array) {
            System.out.println(word);
            System.out.println(word.length());
        }




    }
}
