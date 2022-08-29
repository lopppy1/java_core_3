package org.lessons.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Пишем код - (компиляция) в код для Java Machine (JVM) - JVM преобразует в байт код 1010

        //Примитивные типы данных
        //boolean
        boolean answer = true;
        boolean b2 = false;

        //byte (8 бит или 8 значений 1 или 0)
        byte bt = -128;
        byte bt2 = 127;


        //short - короткое  число (2 байта)
        short sh = -32_768;
        short sh2 = 32_767;

        //int - целое число (4 байт или 32 бит)
        int integer = -2_000_000_000;
        int integer2 = 2_100_000_000;

        //long - длинное целое число (8 байт или 64 бит)
        long lon = 3_000_000_000_000_000_000L;

        //Числа с плавающей точкой
        //float - 32 bit
        float floa = 3.1234567890f;
        //double - 64 bit
        double doub = 3.123456789123456789123456789;

        int x = 4;
        int y = 2;
        int c = x - y;
        int c2 = x + y;
        int c3 = x * y;
        int c4 = x / y;
        int c5 = x % y;
        System.out.println(c);

       char ch = 'ы';
       char ch2 = 111;


       //1 - A
        //2 - B
        //27 - a
        System.out.println(ch);

        char [] answer2 = new char[6];
        answer2[0] = 'М';
        answer2[1] = 'О';
        answer2[2] = 'Т';
        answer2[3] = 'Ы';
        answer2[4] = 'Г';
        answer2[5] = 'А';

        System.out.println(answer2);

        //массив - квадратные скобки, быстро сделать массив через фигурные скобки
        char[] answer3 = {'a', 'b', 'c', 'd'};

        System.out.println(answer3);

        int[] numbers = {1, 2, 3, 4, 5,};

        //текстовый тип данных
        String word1 = "hello";
        String word2 = " world!";
        String result = word1 + word2;
        //Конкатенация - объединение строк
        //как объединять две строки, переменная - это всего лишь хранилище. значения хранятся в правой части
        System.out.println(result);

        String stringFromCharArray = String.valueOf(answer3);
        System.out.println(stringFromCharArray + 'e');

        //Все заглавнгые буквы
        System.out.println(word1.toUpperCase());
        //Все маленькие буквы
        System.out.println(word2.toLowerCase());

        //Длина строки
        System.out.println(word1.length());

        String newWord1 = word1.replaceAll("llo", "licopter");
        System.out.println(newWord1);
        //повторить строку n раз
        System.out.println(word1.repeat(10));
        //убрать лишние пробелы в конце и начале строки
        String word3 ="  s         word     ";
        System.out.println(word3.trim());
        System.out.println("новые изменения");


    }
}