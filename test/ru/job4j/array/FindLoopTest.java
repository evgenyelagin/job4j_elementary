package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int value = 5;
        int[] input = new int[] {5, 4, 3, 2, 1, 0};
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas1Then4() {
        int value = 1;
        int[] input = new int[] {5, 4, 3, 2, 1, 0};
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas6Then1() {
        int value = 6;
        int[] input = new int[] {5, 4, 3, 2, 1, 0};
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind1() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 1;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind8() {
        int[] input = new int[] {5, 2, 10, 2, 4, 8, 13, 15, 7, 9, 20};
        int value = 8;
        int start = 1;
        int finish = 10;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind9() {
        int[] input = new int[] {5, 2, 10, 2, 4, 8, 13, 15, 9, 7, 20, 21};
        int value = 9;
        int start = 1;
        int finish = 10;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 8;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind99() {
        int[] input = new int[] {0, 1, 2, 3, 4, 5, 99, 7, 8, 9, 10, 11};
        int value = 99;
        int start = 0;
        int finish = 10;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 6;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind100() {
        int[] input = new int[] {0, 1, 2, 3, 4, 5, 99, 7, 8, 9, 10, 11};
        int value = 100;
        int start = 0;
        int finish = 10;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}