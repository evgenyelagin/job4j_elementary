package ru.job4j.converter;

import com.sun.jdi.Value;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        int in = 140;
        int expected = 2;
        int out1 = rubleToEuro(in);
        int out2 = rubleToDollar(in);
        boolean passed1 = expected == out1;
        boolean passed2 = expected == out2;
        System.out.println("140 rubles are 2. Test result : " + passed1);
        System.out.println("140 rubles are 2. Test result : " + passed2);
            }
}