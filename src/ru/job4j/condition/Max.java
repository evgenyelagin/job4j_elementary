package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean sravnivau = left > right;
        int result =  sravnivau ? left : right;
        return result;
    }
    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println(result);
    }
}
