package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;


import static org.junit.Assert.*;

public class PointTest {

           @Test
        public void distance() {
            int x1 = 50;
            int y1 = 50;
            int x2 = 100;
            int y2 = 100;
            double expected = 70.72;
            double out = Point.distance(50, 50, 100, 100);
            Assert.assertEquals(expected, out, 0.01);


        }
}