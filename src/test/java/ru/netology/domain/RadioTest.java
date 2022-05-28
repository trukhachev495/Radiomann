package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void numberValidity() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(8);

        int actual = cond.getCurrentRadioStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberValidity2() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(10);

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberValidity3() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(-1);

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
    @Test

    public void next() {
        Radio cond = new Radio();
        cond.next(5);

        int actual = cond.getCurrentRadioStation();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void next2() {
        Radio cond = new Radio();
        cond.next(10);

        int actual = cond.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prev() {
        Radio cond = new Radio();
        cond.prev(5);

        int actual = cond.getCurrentRadioStation();
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prev2() {
        Radio cond = new Radio();
        cond.prev(-1);

        int actual = cond.getCurrentRadioStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberValiditySound() {
        Radio cond = new Radio();

        cond.setSoundVolume(6);

        int actual = cond.getSoundVolume();
        int expected = 6;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberValiditySound1() {
        Radio cond = new Radio();

        cond.setSoundVolume(-1);

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberValiditySound2() {
        Radio cond = new Radio();

        cond.setSoundVolume(11);

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseVolume() {
        Radio cond = new Radio();
        cond.increaseVolume(9);

        int actual = cond.getSoundVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseVolume2() {
        Radio cond = new Radio();
        cond.increaseVolume(11);

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void reduceVolume() {
        Radio cond = new Radio();
        cond.reduceVolume(9);

        int actual = cond.getSoundVolume();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void reduceVolume2() {
        Radio cond = new Radio();
        cond.reduceVolume(11);

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void maximumValue() {
        Radio cond = new Radio();
        cond.maximumValue(11);

        int actual = cond.getSoundVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void maximumValue2 () {
        Radio cond = new Radio();
        cond.maximumValue(9);

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void minValue() {
        Radio cond = new Radio();
        cond.minValue(5);

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void minValue2 () {
        Radio cond = new Radio();
        cond.minValue(-1);

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }
}
