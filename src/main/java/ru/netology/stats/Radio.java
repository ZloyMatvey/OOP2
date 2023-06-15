package ru.netology.stats;

public class Radio {
    // Поля Радиостанции

    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;
    // Поля громкости
    private int minVolume = 0;
    private int maxVolume = 99;
    private int currentVolume = minVolume;

    // Пустой конструктор принимающий значения полей
    public Radio() {

    }


    // Конструктор Радиостанции c установкой максимального кол-ва каналов
    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;

    }


    //Инкапсуляция полей Радиостанции

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    //Инкапсуляция полей громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }


    //Методы радиостанции
    //Увеличение радиостанции
    public void increaseRadioStation() {
        if (currentRadioStation < getMaxRadioStation()) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    //Уменьшение радиостанции
    public void decreaseRadioStation() {
        if (currentRadioStation > getMinRadioStation()) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }


    //Методы громкости
    // Увеличение громкости
    public void increaseVolume() {
        if (currentVolume < getMaxVolume()) {
            currentVolume = currentVolume + 1;
        } else currentVolume = maxVolume;
    }

    // Уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > getMinVolume()) {
            currentVolume = currentVolume - 1;
        } else currentVolume = minVolume;
    }

}
