import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int y = scanner1.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x + " " + y);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число что бы понять является ли оно четным: ");
        int i = scanner2.nextInt();
        int j = i % 2;

        if (j == 0){
            System.out.println("Введенное число является четным");
        }
        else {
            System.out.println("Введенное число является нечетным");
        }


        boolean isPlaneSave;
        boolean meteorRain = false;
        boolean drought = false;
        boolean gasEmissions = false;
        boolean garbagePollution = false;
        boolean wars = false;
        boolean yesMedicines = true;
        boolean yesScientist = true;

        isPlaneSave = !meteorRain && !drought && !gasEmissions && !garbagePollution && !wars && yesScientist && yesMedicines;
        System.out.println(isPlaneSave);

        



    }

}

