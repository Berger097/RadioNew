package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
   @ParameterizedTest
   @CsvFileSource(resources = "/data.csv" , delimiter = '|', numLinesToSkip = 1)
   //тесты ручного изменения станции
    public void test(int expected,  int radioStation){
        Radio radio = new Radio();
        radio.setRadioStation(radioStation);
        assertEquals(expected, radio.getRadioStation(radioStation) );
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data2.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки + изменение станции
    public void test2(int expected, int radiostation){
        Radio radio = new Radio();

        radio.setRadioStation(radiostation);
        radio.setNext();
        assertEquals(expected,  radio.getRadioStation(radiostation));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data3.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки - изменение станции
    public void test3(int expected, int radiostation){
        Radio radio = new Radio();

        radio.setRadioStation(radiostation);
        radio.setPrev();
        assertEquals(expected,  radio.getRadioStation(radiostation));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data4.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки - изменение громкости
    public void test4(int expected, int radioVolume){
        Radio radio = new Radio();

        radio.setRadioVolume(radioVolume);
        radio.minVolume();
        assertEquals(expected,  radio.getRadioVolume(radioVolume));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data5.csv", delimiter = '|', numLinesToSkip = 1)
    //Тест кнопки - изменение громкости
    public void test5(int expected, int radioVolume){
        Radio radio = new Radio();

        radio.setRadioVolume(radioVolume);
        radio.maxVolume();
        assertEquals(expected,  radio.getRadioVolume(radioVolume));
    }

}