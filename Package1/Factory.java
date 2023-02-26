package Package1;

import Package1.Packege1_1.Audi;
import Package1.Packege1_1.BMW;
import Package1.Packege1_1.Volkswagen;

public class Factory {
    public static void main(String[] args) {
        BMW M3 = new BMW();
        System.out.println("Максимальная скорость BMW M3 - " + M3.maxSpeed + "км/ч; "
                + "BMW M3 поставляется в цветах: " + M3.color_1 + ", " + M3.color_2 + "; " +
                "Вес автомобиля состовляет: " + M3.weight);

        Audi A6 = new Audi();
        System.out.println("Максимальная скорость Audi A6 - " + A6.maxSpeed + "км/ч; " +
                "Audi A6 поставляется в цветах: " + A6.color_1 + ", " + A6.color_2 + "; " +
                "Вес Audi A6 состовляет: " + A6.weight);

        Volkswagen PassatB7 = new Volkswagen();
        System.out.println("Максимальная скорость VW Passat B7 - " + PassatB7.maxSpeed + "км/ч; " +
                "VW Passat B7 поставляется в следующих цветах: " + PassatB7.color_1 + ", " + PassatB7.color_2 + "; " +
                "Вес VW Passat B7 состовляет: " + PassatB7.weight);

    }
}
