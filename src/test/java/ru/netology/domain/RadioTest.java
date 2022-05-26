package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void numberValidity() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(40);

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual,expected);
    }
}
