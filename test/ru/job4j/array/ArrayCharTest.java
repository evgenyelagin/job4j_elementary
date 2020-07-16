package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ArrayCharTest {

        @Test
        public void whenStartWithPrefixThenTrue() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] pref = {'H', 'e'};
            boolean result = ArrayChar.startsWith(word, pref);
            assertThat(result, is(true));
        }
    @Test
    public void whenStartWithPrefixThenTrue2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }
        @Test
        public void whenNotStartWithPrefixThenFalse() {
            char[] word = {'H', 'e', 'l', 'l', 'o'};
            char[] pref = {'H', 'i', 'a', 't', 'a'};
            boolean result = ArrayChar.startsWith(word, pref);
            assertThat(result, is(false));
        }
    @Test
    public void whenNotStartWithPrefixThenFalse2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'Z', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotStartWithPrefixThenFalse3() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'z', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
    }