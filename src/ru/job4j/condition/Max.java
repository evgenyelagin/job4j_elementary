package ru.job4j.condition;

public class Max {
    public static int max(int one, int two, int three, int four) {
        int tmp1 = max(one, two);
        int tmp2 = max(three, four);
        return max(tmp1, tmp2);
    }

    public static int max(int one, int two) {
        return Math.max(one, two);
    }

    public static void main(String[] args) {
        int result = Max.max(8, 400, 1, 1026);
        System.out.println(result);
    }
}
