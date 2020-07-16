package ru.job4j.array;

public class ArrayChar {
    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'z', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        System.out.println(result);
    }

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
            for (int j = 0; j < pref.length; j++) {
                result = word[j] == pref[j];
                if (word[j] != pref[j]) {
                    break;
                }
            }
                    return result;

        }
    }

