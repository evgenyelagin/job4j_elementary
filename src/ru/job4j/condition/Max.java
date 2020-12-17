package ru.job4j.condition;

public class Max {
    public static int max(int one, int two, int three, int four) {
        return max(max(one, two), max(three, four));
    }

    public static int max(int one, int two, int three) {
        return max(max(one, two), three);
    }

    public static int max(int one, int two) {
        return Math.max(one, two);
    }

    public static void main(String[] args) {
        int result = Max.max(8, 400, 1, 1026);
        System.out.println(result);
    }
}
