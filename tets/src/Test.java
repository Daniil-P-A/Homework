import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        double result = 0;

            int fourth = number / 1000;
            int third = number / 100 % 10;
            int second = number / 10 % 10;
            int first = number % 10;

            double result1 = (fourth * Math.pow(16, 3) + third * Math.pow(16, 2) + second * Math.pow(16, 1) + first * Math.pow(16, 0));

            System.out.println(result1);

        }
    }
