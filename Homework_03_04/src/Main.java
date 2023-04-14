import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Нажмите 1 если хотите отсортировать готовый массив: ");
        System.out.println("Нажмите 2 если хотите вписать свои числа: ");
        System.out.println("Нажмите 3 если хотите создать масив с рандомными числами: ");

        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();

        NumberOne numberOneReturn = new NumberOne();
        NumberTwo numberTwoReturn = new NumberTwo();
        NumberOne startArray = new NumberOne();




            if (firstNum == 1) {
                startArray.startArray();
                numberOneReturn.NumberOneArray();
            }

            if (firstNum == 2){
                numberTwoReturn.NumberTwoArray();
            }
    }
}
