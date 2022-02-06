package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = '|', numLinesToSkip = 1)
    //тесты ручного изменения станции и максимального колличества станций
    public void test(int expected, int radioStation, int maxStations) {
        Radio radio = new Radio(maxStations);
        radio.setRadioStation(radioStation);
        assertEquals(expected, radio.getRadioStation(radioStation));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data11.csv", delimiter = '|', numLinesToSkip = 1)
    //тесты ручного изменения станции. Количество станций по умолчанию - 10
    public void test11(int expected, int radioStation) {
        Radio radio = new Radio();
        radio.setRadioStation(radioStation);
        assertEquals(expected, radio.getRadioStation(radioStation));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data2.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки + изменение станции. С выставленным вручную максимальным количеством станций
    public void test2(int expected, int radioStation, int maxStations) {
        Radio radio = new Radio(maxStations);

        radio.setRadioStation(radioStation);
        radio.setNext();
        assertEquals(expected, radio.getRadioStation(radioStation));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data22.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки + изменение станции.  Количество станций по умолчанию - 10
    public void test22(int expected, int radioStation) {
        Radio radio = new Radio();

        radio.setRadioStation(radioStation);
        radio.setNext();
        assertEquals(expected, radio.getRadioStation(radioStation));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data3.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки - изменение станции. С выставленным вручную максимальным количеством станций
    public void test3(int expected, int radioStation, int maxStations) {
        Radio radio = new Radio(maxStations);

        radio.setRadioStation(radioStation);
        radio.setPrev();
        assertEquals(expected, radio.getRadioStation(radioStation));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data33.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки - изменение станции. Количество станций по умолчанию - 10
    public void test33(int expected, int radioStation) {
        Radio radio = new Radio();

        radio.setRadioStation(radioStation);
        radio.setPrev();
        assertEquals(expected, radio.getRadioStation(radioStation));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data4.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки - изменение громкости
    public void test4(int expected, int radioVolume) {
        Radio radio = new Radio();

        radio.setRadioVolume(radioVolume);
        radio.minVolume();
        assertEquals(expected, radio.getRadioVolume(radioVolume));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data5.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки - изменение громкости
    public void test5(int expected, int radioVolume) {
        Radio radio = new Radio();

        radio.setRadioVolume(radioVolume);
        radio.maxVolume();
        assertEquals(expected, radio.getRadioVolume(radioVolume));
    }

}