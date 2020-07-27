package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[]{3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort8() {
        int[] input = new int[]{8, 7, 5, 6, 3, 4, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[]{8, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{7, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        int[] input = new int[]{11, 10, 9, 8, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{7, 8, 9, 10, 11};
        assertThat(result, is(expect));
    }
}