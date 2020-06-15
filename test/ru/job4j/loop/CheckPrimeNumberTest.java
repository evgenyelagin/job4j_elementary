package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class CheckPrimeNumberTest {

    @Test
    public void check5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
        }
    @Test
    public void check4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }
    @Test
    public void check1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
    @Test
    public void check7() {
        boolean rsl = CheckPrimeNumber.check(7);
        assertThat(rsl, is(true));
    }
    @Test
    public void check9() {
        boolean rsl = CheckPrimeNumber.check(9);
        assertThat(rsl, is(false));
    }
    @Test
    public void check8() {
        boolean rsl = CheckPrimeNumber.check(8);
        assertThat(rsl, is(false));
    }
   }