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
        for (int i = 0; i < word.length - 1; i++) {
            for (int j = i; j < pref.length - 1; j++) {
                result = word[i] == pref[j];
                if (word[i] != pref[j]) {
                    break;
                }
            }
        }
            return result;

        }
    }

