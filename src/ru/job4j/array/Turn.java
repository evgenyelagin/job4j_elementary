package ru.job4j.array;

public class Turn {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] rsl = back(input);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }

    public static int[] back(int[] input) {
        for (int i = input.length - 1; i > 0; i--) {
            if (i == 1) {
                int temp = input[0];
                input[0] = input[input.length - 1];
                input[input.length - 1] = temp;
                break;
            }
            if (i == 2) {
                int temp1 = input[0];
                input[0] = input[input.length - 1];
                input[input.length - 1] = temp1;
                break;
            }
            if (i == 3) {
                int temp1 = input[0];
                input[0] = input[input.length - 1];
                input[input.length - 1] = temp1;
                int temp2 = input[1];
                input[1] = input[input.length - 2];
                input[input.length - 2] = temp2;
                               break;
            }
        }
        return input;
    }
    }



