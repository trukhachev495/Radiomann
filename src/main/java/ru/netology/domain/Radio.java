package ru.netology.domain;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int soundVolume = minSoundVolume;

    public Radio(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;

    }
    public Radio () {
        this.currentRadioStation = maxRadioStation;

    }

    public void setCurrentRadioStation() {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void next() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            this.currentRadioStation = currentRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
            this.currentRadioStation = currentRadioStation;
        }
    }

    public void prev() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            this.currentRadioStation = currentRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < minSoundVolume) {
            return;
        }
        if (soundVolume > maxSoundVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void maximumValue() {
        if (soundVolume == maxSoundVolume) {
            soundVolume = maxSoundVolume;
        }
        this.soundVolume = soundVolume;
    }

    public void minValue() {
        if (soundVolume <= minSoundVolume) {
            soundVolume = minSoundVolume;
        }
        this.soundVolume = soundVolume;
    }
}

