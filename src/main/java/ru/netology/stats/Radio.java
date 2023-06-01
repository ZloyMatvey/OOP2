package ru.netology.stats;

public class Radio {
    // Радиостанция
    public int currentRadioStation;

    //Увеличение радиостанции
    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    //Уменьшение радиостанции
    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    // Установка станции в ручную. Проверку на станцию менее 0 не делаю.
    // Т.к переключить на станцию менее 0 технически не возможно (с точни зрения пользователя)
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation <= 9)
            currentRadioStation = newCurrentRadioStation;
        else return;

    }

    //Громкость
    public int currentVolume;

    // Увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 100;
    }

    // Уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }

}
