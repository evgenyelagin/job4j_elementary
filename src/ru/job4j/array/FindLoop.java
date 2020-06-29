package ru.job4j.array;

    public class FindLoop {
        public static int indexOf(int[] input, int el) {
            int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
            for (int index = 0; index < input.length; index++) { // заполняю массив через цикл фор
                 if (input[index] == el) { /* если индекс равен el - условие верное - то rst присваиваем индекс массива */
                    rst = index;
                    break;
                }
            }
            return rst;
        }
        public static void main(String[] args) {
            int[] input = new int[] {5, 4, 3, 2, 1, 0};
            int rsl = indexOf(input, 5);
            System.out.println(rsl);
            }
        }





