package guru.qa;

public class Main {

    public static void main(String[] args) {
        // Целочисленные типы
        byte aByte = 0; // 8bit -128 +127
        short aShort = 0; // 16bit -32768 +32767
        int aInt = 0; // 32bit (-2^32) .. (+2^32 -1)
        Integer intWrapper = 0;
        long aLong = 0; // 64bit

        // Типы с плавающей точкой
        float aFloat = 0.0F;
        double aDouble = 0.0;
        Double doubleWrapper = 9.1;

        // Символьный тип
        char aChar = 'a'; // на самом деле целочисленный тип под капотом
        Character charWrapper = 'a';

        // Логический тип
        boolean aBoolean = true;
        Boolean booleanWrapper = true;

        // Строка (и бесконечность других объектных/ссылочных типов)
        String toBePrint = "Hello world";

        // Операторы
        // Операторы присвоения = (справа присваивает переменную слева)
        String name = "Daniil";
        // Арифметические операторы + - / * (умножение) % (взятие остатка от деления) ++ (инкримент) -- (дикримент)
        System.out.println(4.0 / 3); // деление в джаве отбрасывает остаток у целых чисел, поэтому используют double
        // Операторы сравнения <, >, >= (больше или равно), <= (меньше или равно), != (не равно), == (равно)
        System.out.println(3 >= 2); // объектные типы сравнивают методом equals
        //Логические операторы & (и), | (или), && (сокращенное и), || (сокращенное или), ! (инвертирует переменную)
        int age = 24;
        System.out.println(name.equals("Daniil") && age == 24); //&& не вычисляет остаток выражения, если результат уже известен, то есть эту часть (age == 24)
        // Оператор instanceof
        System.out.println(!(name instanceof String));
        // Тернарный оператор
        char sex = 'm';
        String childName = sex == 'm'
                ? "Valentin"
                : "Valentina";
        // Управляющая конструкция if (если не нужно возвращать результат)
        if (sex == 'm') {
            childName = "Valentin";
        } else {
            childName = "Valentina";
        }

        // Ключевое слово new (создание объекта, можно не использовать string из-за популярности объекта) и автоматически подставляется в статических методах

        String name1 = new String("Danya");
        String name2 = "Danya";


        System.out.println("toBePrint");
    }
}