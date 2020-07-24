package ru.job4j.array;

public class Min {
    public static void main(String[] args) {
        int[] array = {10, 5, 4, 3, 2, 1, 11};
        int rsl = findMin(array);
        System.out.println(rsl);
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }

        }
        return min;
    }
}
