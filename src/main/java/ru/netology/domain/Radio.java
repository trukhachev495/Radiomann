package ru.netology.domain;
public class Radio {
    private int currentRadioStation;
    private int soundVolume;

    public void setCurrentRadioStation (int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
}
