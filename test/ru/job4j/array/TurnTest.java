package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArray1() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArray4() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArray2() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3};
        int[] result = turner.back(input);
        int[] expect = new int[] {3, 2, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArray6() {
        Turn turner = new Turn();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] result = turner.back(input);
        int[] expect = new int[]{7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArray9() {
        Turn turner = new Turn();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = turner.back(input);
        int[] expect = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}