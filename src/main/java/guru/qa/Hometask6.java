package guru.qa;

public class Hometask6 {

    public static void main(String[] args) {

        // Целочисленные типы

        byte a = 10; // 8bit -128 +127
        short b = 15; // 16bit -32768 +32767
        int c = Integer.MAX_VALUE; // 32bit (-2^32) .. (+2^32 -1)

        // Типы с плавающей точкой

        float f = 1.11f;
        double g = 2.22;

        // Логический тип

        boolean h = true;
        boolean j = false;

        // Арифметические операторы int double

        System.out.println(b+g);
        System.out.println(b*g);
        System.out.println(b-g);
        System.out.println(b/a);
        System.out.println(a%g);
        System.out.println(++g);
        System.out.println(--g);

        // Логические операторы

        System.out.println(h&&j);
        System.out.println(h||j);
        System.out.println(!j);

        //Переполнения при вычислениях

        System.out.println (c+1);
    }
}
