package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxOne() {
        int result = Max.max(10, 20);
        assertThat(result, is(20));
    }
    @Test
    public void whenMaxTwo() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenOneEquallyTwo() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMaxFour() {
        int result = Max.max(2, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMaxOneOfFour() {
        int result = Max.max(100, 2, 3, 4);
        assertThat(result, is(100));
    }
    @Test
    public void whenMaxThree() {
        int result = Max.max(100, 2, 300, 4);
        assertThat(result, is(300));
    }
    @Test
    public void whenMaxTwoOfFour() {
        int result = Max.max(100, 1200, 300, 4);
        assertThat(result, is(1200));
    }
    @Test
    public void whenOneOfFourEquallyFour() {
        int result = Max.max(1000, 120, 300, 1000);
        assertThat(result, is(1000));
    }
}