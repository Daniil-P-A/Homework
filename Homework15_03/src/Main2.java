public class Main2 {
    public static void main(String[] args) {

        byte aByte = 125;
        int anInt = 1250;
        double aDouble = 12.5;
        float aFloat = 1.2F;

        byte a = (byte) anInt;
        int b = aByte;


        System.out.println("Задание 2: " + "" + "\n1)Сужение из 'int' в 'byte': " + a + ";" + "\n2)Расширение из 'byte' в 'int': " + b + ";");

    }
}

