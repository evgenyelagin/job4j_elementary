package ru.job4j.array;

public class Turn {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4};
        int[] rsl = back(input);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
    public static int[] back(int[] input) {
        for (int i = 0; i < input.length - 1 - i; i++) {
                int temp = input[i];
                input[i] = input[input.length - 1 - i];
                input[input.length - 1 - i] = temp;
                          }
        return input;
    }
}



