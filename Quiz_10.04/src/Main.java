import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветству в нашей игре, для начала введите имена: ");
        System.out.println("Игрок номер 1: ");
        String gamerFirst = scanner.next();
        System.out.println("Игрок номер 2: ");
        String gamerSecond = scanner.next();
        System.out.println("Правила игры просты, начинаем с " + gamerFirst + ", игрок " + gamerSecond + " продолжает.");
        System.out.println("Каждому игроку будет заданно по 5 вопроссов, побеждает тот кто ответит правильно на наибольшее количество вопроссов");
        System.out.println("Игра Начинается!");
        System.out.println();
        Main main = new Main();

        int firstGamer = main.FirstGamer();
        int secondGamer = main.SecondGamer();

        System.out.println("Игрок - " + gamerFirst + ", заработал " + firstGamer + " очков!");
        System.out.println("Игрок - " + gamerSecond + ", заработал " + secondGamer + " очков!");

        if (firstGamer > secondGamer){
            System.out.println("Игрок - " + gamerFirst + " победил!");
        }
        else if (firstGamer < secondGamer){
            System.out.println("Игрок - " + gamerSecond + " победил!");
        }
    }

    public int FirstGamer() {
        Scanner scanner = new Scanner(System.in);

        int points = 0;
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            Rend randomNumbers = new Rend();

            int randomNum = random.nextInt(4);

            int firstRandNum = randomNumbers.firstRandNum;
            int secondRandNum = randomNumbers.secondRandNum;
            int thirdRandNum = randomNumbers.thirdRandNum + 1;
            int fourRandNum = randomNumbers.fourRandNum;

            int plus = randomNumbers.plus;
            int minus = randomNumbers.minus;
            int divide = randomNumbers.divide;
            int multiply = randomNumbers.multiply;


            if (randomNum == 0) {
                System.out.println("Решите: " + firstRandNum + " + " + secondRandNum);
            } else if (randomNum == 1) {
                System.out.println("Решите: " + fourRandNum + " / " + thirdRandNum);
            } else if (randomNum == 2) {
                System.out.println("Решите: " + fourRandNum + " * " + thirdRandNum);
            } else if (randomNum == 3) {
                System.out.println("Решите: " + firstRandNum + " - " + secondRandNum);
            }


            int personNum = scanner.nextInt();

            if (personNum == plus && randomNum == 0) {
                points += 5;
                System.out.println("Верно, число: " + plus + "\nВаши очки: " + points);
                System.out.println();}
            else if (personNum != plus && randomNum == 0) {
                points -= 5;
                System.out.println("К сожалению это не верно, правильный ответ: " + plus + "\nВаши очки: " + points);
                System.out.println();}


            else if (personNum == minus && randomNum == 3) {
                points += 5;
                System.out.println("Верно, число: " + minus + "\nВаши очки: " + points);
                System.out.println();}
            else if (personNum != minus && randomNum == 3) {
                points -= 5;
                System.out.println("К сожалению это не верно, правильный ответ: " + minus + "\nВаши очки: " + points);
                System.out.println();}


            else if (personNum == divide && randomNum == 1) {
                points += 5;
                System.out.println("Верно, это число: " + divide + "\nВаши очки: " + points);
                System.out.println();}
            else if (personNum != divide && randomNum == 1) {
                points -= 5;
                System.out.println("К сожалению ответ таков: " + divide + "\nВаши очки: " + points);
                System.out.println();}


            else if (personNum == multiply && randomNum == 2) {
                points += 5;
                System.out.println("Верно, результат умножения: " + multiply + "\nВаши очки: " + points);
                System.out.println();}
            else if (personNum != multiply && randomNum == 2) {
                points -= 5;
                System.out.println("Не верно, правильный результат умноЖения: " + multiply + "\nВаши очки: " + points);
                System.out.println();}


            else
                System.out.println("Ошибка");


        }
        System.out.println("Вы заработали: " + points + " очков");
        return points;


    }

    public int SecondGamer(){

        System.out.println();
        System.out.println("Следующий игрок, приступайте к выполнению");


        Scanner scanner = new Scanner(System.in);
        int points = 0;
        for (int i = 0; i < 5; i++){
            Random random = new Random();
            Rend randomNumbers = new Rend();

            int randomNum = random.nextInt (4);

            int firstRandNum = randomNumbers.firstRandNum;
            int secondRandNum = randomNumbers.secondRandNum;
            int thirdRandNum = randomNumbers.thirdRandNum;
            int fourRandNum = randomNumbers.fourRandNum;

            int plus = randomNumbers.plus;
            int minus = randomNumbers.minus;
            int divide = randomNumbers.divide;
            int multiply = randomNumbers.multiply;




            if (randomNum == 0) {
                System.out.println("Решите: " + firstRandNum + " + " + secondRandNum);
            } else if (randomNum == 1) {
                System.out.println("Решите: " + fourRandNum + " / " + thirdRandNum);
            } else if (randomNum == 2) {
                System.out.println("Решите: " + fourRandNum + " * " + thirdRandNum);
            } else if (randomNum == 3) {
                System.out.println("Решите: " + firstRandNum + " - " + secondRandNum);
            }


            int personNum = scanner.nextInt();

            if (personNum == plus && randomNum == 0) {
                points += 5;
                System.out.println("Верно, число: " + plus + "\nВаши очки: " + points);
                System.out.println();}
            else if (personNum != plus && randomNum == 0){
                points -= 5;
                System.out.println("К сожалению это не верно, правильный ответ: " + plus + "\nВаши очки: " + points);
                System.out.println();}


            else if (personNum == minus && randomNum == 3) {
                points += 5;
                System.out.println("Верно, число: " + minus + "\nВаши очки: " + points);
                System.out.println();}
            else if (personNum != minus && randomNum == 3){
                points -= 5;
                System.out.println("К сожалению это не верно, правильный ответ: " + minus + "\nВаши очки: " + points);
                System.out.println();}


            else if (personNum == divide && randomNum == 1){
                points += 5;
                System.out.println("Верно, это число: " + divide + "\nВаши очки: " + points);
                System.out.println();}
            else if (personNum != divide && randomNum == 1){
                points -= 5;
                System.out.println("К сожалению ответ таков: " + divide + "\nВаши очки: " + points);
                System.out.println();}


            else if (personNum == multiply && randomNum == 2){
                points += 5;
                System.out.println("Верно, результат умножения: " + multiply + "\nВаши очки: " + points);
                System.out.println();}

            else if (personNum != multiply && randomNum == 2){
                points -= 5;
                System.out.println("Не верно, правильный результат умноЖения: " + multiply + "\nВаши очки: " + points);
                System.out.println();}


            else
                System.out.println();


        }
        System.out.println("Вы заработали: " + points + " очков");
        return points;
    }
}