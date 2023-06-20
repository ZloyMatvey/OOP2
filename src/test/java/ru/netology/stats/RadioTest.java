package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тест следующего радиоканала, когда кол-во станций по умолчанию
    @Test
    public void nextRadioStationDefault() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    // Тест следующий радио канал
    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    // Тест следующий радо канал, когда текущий уже максимальный
    @Test
    public void nextRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    // Тест предыдущий радиоканал
    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    // Тест редыдущий радиоканал, когда текущий уже 0
    @Test
    public void prevRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    // Тест установки станции в ручную.
    @Test
    public void shouldSetRadioStationByHand() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    // Тест на установку станции в ручную выше максимальной!!!
    @Test
    public void shouldSetRadioStationByHandOver() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(100);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    // Тест увеличение громкости
    @Test
    public void nextVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(58);
        volume.increaseVolume();
        int expected = 59;
        Assertions.assertEquals(expected, volume.getCurrentVolume());
    }

    // Тест увеличение громкости когда она уже 100
    @Test
    public void nextVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 99;
        Assertions.assertEquals(expected, volume.getCurrentVolume());
    }

    // Тест уменьшение громкости
    @Test
    public void prevVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(23);
        volume.decreaseVolume();
        int expected = 22;
        Assertions.assertEquals(expected, volume.getCurrentVolume());
    }

    // Тест уменьшение громкости когда она уже на 0
    @Test
    public void prevVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        Assertions.assertEquals(expected, volume.getCurrentVolume());
    }

    // Тест установки количества радиоканалов
    @Test
    public void QuantityRadioStation() {
        Radio radio = new Radio(15);
        radio.settingQuantityRadioChannels();
        int expected = 14;
        Assertions.assertEquals(expected, radio.getMaxRadioStation());
    }

    // Тест установки количества радиоканалов в количестве по умолчанию
    @Test
    public void QuantityRadioStationDefault() {
        Radio radio = new Radio(10);
        radio.settingQuantityRadioChannels();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getMaxRadioStation());
    }

    //Тест переключения станции, когда изменено их общее кол-во
    @Test
    public void nextRadioStationWithQuantity() {
        Radio radio = new Radio(50);
        radio.settingQuantityRadioChannels();
        radio.setCurrentRadioStation(39);
        radio.increaseRadioStation();
        int expected = 40;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }
}
