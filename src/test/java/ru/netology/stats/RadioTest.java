package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тест следующий радио канал
    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Тест следующий радо канал, когда текущий уже 9
    @Test
    public void nextRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // Тест предыдущий радиоканал
    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // Тест редыдущий радиоканал, когда текущий уже 0
    @Test
    public void prevRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    // Тест установки станции в ручную.
    @Test
    public void shouldSetRadioStationByHand() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Тест на установку станции в ручную выше 9!!!
    @Test
    public void shouldSetRadioStationByHandOver() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(100);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Тест увеличение громкости
    @Test
    public void nextVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(58);
        volume.increaseVolume();
        int expected = 59;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Тест увеличение громкости когда она уже 100
    @Test
    public void nextVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тест уменьшение громкости
    @Test
    public void prevVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(23);
        volume.decreaseVolume();
        int expected = 22;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тест уменьшение громкости когда она уже на 0
    @Test
    public void prevVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
