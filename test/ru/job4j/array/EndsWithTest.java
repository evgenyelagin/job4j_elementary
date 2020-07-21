package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {

            @Test
        public void whenEndWithPrefixThenTrue() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] post = {'l', 'o'};
            boolean result = EndsWith.endsWith(word, post);
            assertThat(result, is(true));
        }

        @Test
        public void whenNotEndWithPrefixThenFalse() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] post = {'l', 'a'};
            boolean result = EndsWith.endsWith(word, post);
            assertThat(result, is(false));
        }
        @Test
    public void whenEndWithPrefixThenFalse1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'v', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotEndWithPrefixThenFalse2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'Z', 'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }


}