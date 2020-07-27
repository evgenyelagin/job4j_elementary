package ru.job4j.array;


import java.util.Arrays;

public class SortSelected {
    public static void main(String[] args) {
        int[] data = new int[] {8, 6, 4, 2, 3, 7, 5, 1};
        System.out.println(Arrays.toString(SortSelected.sort(data)));
    }
    public static int[] sort(int[] data) {
            for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf2(data, min, i, data.length - 1);
                int temp = min;
                data[index] = data[i];
                data[i] = temp;
        }
        return data;
    }
}
