package ru.job4j.array;

public class EndsWith {
    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        System.out.println(result);
    }
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i <= post.length - 1; i++) {
          result = word[word.length - 1 - i] == post[post.length - 1 - i];
          if (!result) {
              break;
          }
            }
        return result;

    }
}
