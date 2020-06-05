package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;


public class SqAreaTest {

    @Test
    public void square1() {
        int p = 6;
        int k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square2() {
        int p = 7;
        int k = 20;
        int expected = 12;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square3() {
        int p = 1;
        int k = 2;
        int expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square4() {
        int p = 0;
        int k = 4;
        int expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
