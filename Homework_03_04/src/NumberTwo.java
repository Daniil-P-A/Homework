import java.util.Scanner;

public class NumberTwo {
    public void StartArray(){

    }
    public void NumberTwoArray() {
        int temp;
        boolean bool = false;
        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел: ");


        for (int i = 0; i < array.length; i++) {
            int scanSecond = scanner.nextInt();

            array[i] = scanSecond;
        }

        while (!bool) {
            bool = true;
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    bool = false;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int x : array) {
            System.out.print(x + " ");}

    }
}

