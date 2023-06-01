package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тест следующий радио канал
    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 5;
        radio.increaseRadioStation();
        int expected = 6;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    //Тест следующий радо канал, когда текущий уже 9
    @Test
    public void nextRadioStationMax() {
        Radio radio = new Radio();
        radio.currentRadioStation = 9;
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    // Тест предыдущий радиоканал
    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 5;
        radio.decreaseRadioStation();
        int expected = 4;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    // Тест редыдущий радиоканал, когда текущий уже 0
    @Test
    public void prevRadioStationMin() {
        Radio radio = new Radio();
        radio.currentRadioStation = 0;
        radio.decreaseRadioStation();
        int expected = 9;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    // Тест установки станции в ручную
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    // Тест установки станции в ручную более 9.
    // Тест менее 0 писать не стал. Т.к будем откровенными, не возможно переключить на радиостанцию -1
    @Test
    public void shouldSetRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(15);
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    //Тест увеличение громкости
    @Test
    public void nextVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 58;
        volume.increaseVolume();
        int expected = 59;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    //Тест увеличение громкости когда она уже 100
    @Test
    public void nextVolumeMax() {
        Radio volume = new Radio();
        volume.currentVolume = 100;
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    // Тест уменьшение громкости
    @Test
    public void prevVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 23;
        volume.decreaseVolume();
        int expected = 22;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    // Тест уменьшение громкости когда она уже на 0
    @Test
    public void prevVolumeMin() {
        Radio volume = new Radio();
        volume.currentVolume = 0;
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
}
