package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;
import org.junit.Test;

public class X2Test {

        @Test
        public void calc() {
            /* Входные параметры. Их будет 4 штуки */
            int a = 1;
            int b = 1;
            int c = 1;
            int x = 1;
            /* ожидаемое значение. Это всегда одна переменная. */
            int expected = 3;
            int rsl = X2.calc(a, b, c, x);
            Assert.assertEquals(rsl, expected);
        }
    }
