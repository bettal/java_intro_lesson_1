package ru.geekbrains.java_level1_introapp;

public class Main {

    public static void main(String[] args) {
    int a, b, c, d;
        //метод расчета выражения
        System.out.println(addSome(a = 10, b = 20, c = 30, d = 60));
        //попадание суммы двух чисел в промежуток
        System.out.println(tenTwenty(a = 15, b = -4));
        //определяем знак числа
        System.out.println((positiveNegative(a=-0)) ? "положительное число" : "отрицательное число");
        //отрицательное число
        System.out.println(negative(a = -1) );
        //приветствие
        welcome("Стас");
        //проверим год на высокостность
        lofty(304);
    }
    static void intro(){
        //Обявляю переменные примитивных типов
        byte b = -127;
        short s = -32768;
        int i = -2147483648;
        long l = -9223372036854775808L;
        float f = -1.4e-45f;
        double d = -9223.37203;
        boolean b1 =  true;
        char c = 'S';
    }
        public static  float addSome(int a, int b, int c, int d){
        //расчитаем выражение a * (b + (c / d))
        return a * (b + (c /d));
    }
    //проверям попадание суммы в промежуток
    public static boolean tenTwenty(int a, int b){
        boolean s = (a + b) >= 10 && (a + b) <= 20;
        return s;
    }
    //положительное отрицательное
    public static boolean positiveNegative(int a){
        boolean sing = a >=0;
        return sing;
    }

    //отрицательное число
    public static String negative(int a){
        boolean sing = a <0;
        return (sing  ? "true" : "") ;
    }
    //склеиваем строки
    public static void welcome( String name){
        System.out.println("Привет, " + name + " !");
    }
    //вычисляем высокосный год
    public static void lofty(int a){
        boolean loft = true;
        if (a %400 == 0){
            loft = true;
        }else  if (a %100 == 0) {
            loft = false;
        } else if (a%4 == 0){
            loft = true;
        }else {
            loft = false;
        }
        if (loft == true) {
            System.out.println(a + " высокосный год");
        }else {
            System.out.println(a + " невысокосный год");
        }
    }


}
