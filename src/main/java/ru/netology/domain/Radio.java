package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
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

    public void next(int currentRadioStation) {
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
            this.currentRadioStation = currentRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
            this.currentRadioStation = currentRadioStation;
        }
    }

    public void prev(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
            this.currentRadioStation = currentRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void increaseVolume(int soundVolume) {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        } else {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void reduceVolume(int soundVolume) {
        if (soundVolume < 10) {
            soundVolume = soundVolume -1;
        } else {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void maximumValue ( int soundVolume) {
        if (soundVolume > 10) {
            soundVolume = 10;
        } else {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void minValue ( int soundVolume) {
        if (soundVolume < 0) {
            soundVolume = 0;
        } else {
            return;
        }
        this.soundVolume = soundVolume;
    }
}

