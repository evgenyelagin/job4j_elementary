package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

        @Test
        public void calc1() {
            int a = 1;
            int b = 1;
            int c = 1;
            int x = 1;
            int expected = 3;
            int rsl = X2.calc(a, b, c, x);
            Assert.assertEquals(rsl, expected);
        }
    @Test
    public void calc2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(rsl, expected);
    }
    @Test
    public void calc3() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(rsl, expected);
    }
    @Test
    public void calc4() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(rsl, expected);
    }
    }
