package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void numberValidity() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation();
        int actual = cond.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberValidity2() {
        Radio cond = new Radio(10);
        cond.setCurrentRadioStation();
        int actual = cond.getCurrentRadioStation();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberValidity3() {
        Radio cond = new Radio(-1);
        cond.setCurrentRadioStation();
        int actual = cond.getCurrentRadioStation();
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void next() {
        Radio cond = new Radio(5);
        cond.next();
        int actual = cond.getCurrentRadioStation();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void next2() {
        Radio cond = new Radio(9);
        cond.next();

        int actual = cond.getCurrentRadioStation();
        int expected = cond.getMinRadioStation();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prev() {
        Radio cond = new Radio(5);
        cond.prev();

        int actual = cond.getCurrentRadioStation();
        int expected = 4;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prev2() {
        Radio cond = new Radio(0);
        cond.prev();

        int actual = cond.getCurrentRadioStation();
        int expected = cond.getMaxRadioStation();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberValiditySound() {
        Radio cond = new Radio();
           cond.setSoundVolume(60);

        int actual = cond.getSoundVolume();
        int expected = 60;

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

        cond.setSoundVolume(101);

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void maximumValue() {
        Radio cond = new Radio();
        cond.setSoundVolume(100);
        cond.maximumValue();

        int actual = cond.getSoundVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void maximumValue2() {
        Radio cond = new Radio();
        cond.setSoundVolume(99);
        cond.maximumValue();

        int actual = cond.getSoundVolume();
        int expected = 99;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void minValue() {
        Radio cond = new Radio();
        cond.setSoundVolume(0);
        cond.minValue();

        int actual = cond.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void minValue2() {
        Radio cond = new Radio();
        cond.setSoundVolume(1);
        cond.minValue();

        int actual = cond.getSoundVolume();
        int expected = 1;

        Assertions.assertEquals(actual, expected);

    }
}
