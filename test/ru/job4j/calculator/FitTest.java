package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;


public class FitTest {

    @Test
    public void manWeight() {
        double in = 176;
        double expected = 87.40;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }
    @Test
    public void womanWeight() {
        double in = 165;
        double expected = 63.25;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }
}