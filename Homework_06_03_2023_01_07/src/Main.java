public class Main {
    public static void main(String[] args) {


        // change name code
        Car realCar_1 = new Car();
        realCar_1.nameCar = "VW";
        System.out.println(realCar_1.nameCar);


        Car realCar_1_2 = new Car();
        System.out.println(realCar_1_2.nameCar);

        // error code
        Car realCat_2 = new Car();
        System.out.println(realCat_2.nameCar2);

        // Static code
        System.out.println(Car.nameCarStatic);



    }
}
