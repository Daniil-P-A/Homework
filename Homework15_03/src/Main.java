import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        String study = "I study Basic Java!";

        String resultString = study.toLowerCase();
        String resultString2 = study.toUpperCase();

        String cont = String.valueOf(study.contains("Java"));

        String replace = study.replace("a", "o");

        int resultChar = study.codePointAt( 0);

        System.out.println("1) Вывод строки в нижнем регистре: " + resultString + "\n2) Вывод строки в нижнем регистре:  " + resultString2 +
                "\n3) Проверка строки на содержание слова 'Java' " +  "\n4) Вывод последнего символа в слове 'Java': " + study.charAt(15));
        System.out.println("5) Проверка на содержание 'Java' в строке: " + cont);
        System.out.println("6) Вырезаем строку'Java': " + study.substring(14, 18));
        System.out.println("7) Заменяем все буквы 'a' на 'o' в строке: " + replace);





    }
}
