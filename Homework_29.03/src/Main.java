import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fruit[] fruits = {
                new Fruit("apple", true, "green"),
                new Fruit("cherry", false, "red/white/black"),
                new Fruit("banana", true, "yellow/green")
        };
        String[] string = {"Zero", "One", "Two"};


        int iterationNumForEach = 0;

        //   (Переменная для хран. фруктов) : (название массива с фруктами)
        for (Fruit currentFruit : fruits) {
            System.out.println("Iteration: " + iterationNumForEach);
            System.out.println("Fruit name: " + currentFruit.name);
            System.out.println("Fruit color: " + currentFruit.color);
            System.out.println("Fruit is tasty?: " + currentFruit.isTasty);
            System.out.println();
            iterationNumForEach++;
        }

        int iterationNumFor = 0;

        for (int i = 0; i < fruits.length; i++){
            Fruit fruits1 = fruits[i];
            System.out.println("Номер итерации: " + iterationNumFor);
            System.out.println("Название фрукта: " + fruits1.name);
            System.out.println("Цвет фрукта: " + fruits1.color);
            System.out.println("Является ли фрукт вкусным: " + fruits1.isTasty);
            System.out.println();
            iterationNumFor++;

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для какого блюда хотите узнать ингредиенты:" +
                "\n'draniki'" +
                "\n'pancakes'" +
                "\n'pelmeni'" +
                "\n'pizza'" +
                "\n'hamburger'");
        String name = scanner.next();

        Borsch borsch1 = new Borsch();
        Borsch.name1  = "borsch";

        Draniki draniki = new Draniki();
        Draniki.name = "draniki";

        Pancakes pancakes = new Pancakes();
        Pancakes.name = "pancakes";

        Pizza pizza = new Pizza();
        pizza.name = "pizza";

        Hamburger hamburger = new Hamburger();
        Hamburger.name = "hamburger";

        Pelmeni pelmeni = new Pelmeni();

        switch (name){
            case "hamburger":
                System.out.println(Hamburger.ingredients);
                break;
            case "pizza":
                System.out.println(pizza.ingredients);
                break;
            case "draniki":
                System.out.println(Draniki.ingredients);
                break;
            case "pancakes":
                System.out.println(Pancakes.ingredients);
            case "pelmeni":
                System.out.println(pelmeni.ingredients);
            default:
                System.out.println("У нас нет ингридиентов для этого блюда");
            }


        // С if сделал для себя
//        if (name.equals(Borsch.name1)){
//            System.out.println(Borsch.ingredients);
//        }
//        else if (name.equals(Draniki.name)){
//            System.out.println(Draniki.ingredients);
//        }
//        else if (name.equals(Pancakes.name)) {
//            System.out.println(Pancakes.ingredients);
//        }
//        else if (name.equals(pizza.name)) {
//            System.out.println(pizza.ingredients);
//        }
//        else if (name.equals(pelmeni.name)) {
//            System.out.println(pelmeni.ingredients);
//        }
//        else if (name.equals(Hamburger.name)) {
//            System.out.println(Hamburger.ingredients);
//        }
//        else
//            System.out.println("К сожалению у нас нет таких ингридеентов ");

    }
}
