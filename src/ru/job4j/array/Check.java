package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            result = data[0] == data[0 + i];
            if (i == data.length - 1) {
                break;
            }
            return result;
        }
}
}
