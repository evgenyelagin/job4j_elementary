package ru.job4j.array;

public class SwitchArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
            int[] input = new int[]{1, 2, 3, 4};
            int[] rsl1 = swap(input, 0, input.length - 1);
            for (int index = 0; index < rsl1.length; index++) {
                System.out.println(rsl1[index]);
            }
    }
    public static int[] swapBorder(int[] array) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            return array;
        }

            public static int[] swap(int[] input, int source, int dest) {
               int temp = input[source];
                input[source] = input[dest];
                input[dest] = temp;
                return input;
            }
        }


