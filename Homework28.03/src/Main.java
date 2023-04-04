import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner scanner1 = new Scanner(System.in);
        Account account = new Account();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        account.currentAmount = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Напишите категорию покупки (stylish / programmer / captain): ");
        account.category = scanner1.next();


        Car Volvo = new Car();
        Volvo.price = 3500;
        Volvo.category = "stylish";
        Car Mercedes = new Car();
        Mercedes.price = 5000;
        Mercedes.category = "stylish";

        Phone iPhone = new Phone();
        iPhone.price = 1500;
        iPhone.category = "programmer";
        Phone Huawei = new Phone();
        Huawei.price = 500;
        Huawei.category = "programmer";

        Plane AirBus = new Plane();
        AirBus.price = 20000;
        AirBus.category = "captain";
        Plane Boeing = new Plane();
        Boeing.price = 15000;
        Boeing.category = "captain";


        programmer(iPhone, Huawei, account);
        stylish(Volvo, Mercedes, account);
        captain(AirBus, Boeing, account);
   }


   public static void programmer(Phone iPhone, Phone Huawei, Account account) {


        if ((account.currentAmount >= iPhone.price + Huawei.price) && (account.category.equals(iPhone.category)) ) {
            System.out.println("Можем купить два телефона");
        }
        else if ((account.currentAmount >= iPhone.price && account.currentAmount >= Huawei.price && account.currentAmount < iPhone.price + Huawei.price) && (account.category.equals(iPhone.category))) {
            System.out.println("Можете купить либо iPhone, либо Huawei");
        }
        else if (account.currentAmount >= iPhone.price && (account.category.equals(iPhone.category))) {
            System.out.println("Покупаем iPhone");
        }
        else if (account.currentAmount >= Huawei.price && (account.category.equals(iPhone.category))) {
            System.out.println(" Покупаем Huawei");
        }
        else if ((account.currentAmount < iPhone.price && account.currentAmount < Huawei.price) && account.category.equals(iPhone.category)) {
            System.out.println("Not");
        }

    }
    public static void stylish(Car Volvo, Car Mercedes, Account account){
        if ((account.currentAmount >= Volvo.price + Mercedes.price) && (account.category.equals(Volvo.category))) {
            System.out.println("Можем купить два автомобиля");
        }
        else if ((account.currentAmount >= Volvo.price && account.currentAmount >= Mercedes.price && account.currentAmount < Volvo.price + Mercedes.price) && (account.category.equals(Volvo.category))) {
            System.out.println("Можете купить либо Mercedes, либо Volvo");
        }
        else if ((account.currentAmount >= Volvo.price) && (account.category.equals(Volvo.category))) {
            System.out.println("Можем купить Volvo");
        }
        else if ((account.currentAmount >= Mercedes.price) && (account.category.equals(Volvo.category))){
            System.out.println("Можем купить Mercedes");
        }
        else if (account.currentAmount < Volvo.price && account.currentAmount < Mercedes.price && account.category.equals(Volvo.category))
            System.out.println("Не покупаем никакое авто");


    }
    public static void captain(Plane AirBus, Plane Boeing, Account account) {

        if ((account.currentAmount >= AirBus.price + Boeing.price) && (account.category.equals(AirBus.category))) {
            System.out.println("Можем купить два самолета");
        } else if ((account.currentAmount >= AirBus.price && account.currentAmount >= Boeing.price && account.currentAmount < AirBus.price + Boeing.price) && (account.category.equals(AirBus.category))) {
            System.out.println("Можете купить либо Boeing либо AirBus");
        } else if ((account.currentAmount >= AirBus.price) && (account.category.equals(AirBus.category))) {
            System.out.println("Можем купить Airbus");
        } else if ((account.currentAmount >= Boeing.price) && (account.category.equals(AirBus.category))) {
            System.out.println("Можем купить Boeing");
        } else if (account.currentAmount < AirBus.price && account.currentAmount < Boeing.price && account.category.equals(AirBus.category)) {
            System.out.println("Не хватает денег ни на один самолет");
        }

    }
}