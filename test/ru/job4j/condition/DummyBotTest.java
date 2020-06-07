package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;



public class DummyBotTest {

    @Test
    public void answerWhenGreetBot() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, умник")
        );
    }
    @Test
    public void answerWhenByeBot() {
        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }
    @Test
    public void answerWhenUnknownBot() {
        assertThat(
                DummyBot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
    @Test
    public void answer4() {
        assertThat(
                DummyBot.answer("как жить дальше то?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
    }
