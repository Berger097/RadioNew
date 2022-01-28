package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
   @Test
   //тесты ручного изменения станции
    public void test1(){
        Radio radio = new Radio();
        radio.setRadioStation(0);

        int expected = 0;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    //тесты ручного изменения станции
    public void test2(){
        Radio radio = new Radio();
        radio.setRadioStation(-1);

        int expected = 9;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    //тесты ручного изменения станции
    public void test3(){
        Radio radio = new Radio();
        radio.setRadioStation(1);

        int expected = 1;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    //тесты ручного изменения станции
    public void test4(){
        Radio radio = new Radio();
        radio.setRadioStation(8);

        int expected = 8;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    //тесты ручного изменения станции
    public void test5(){
        Radio radio = new Radio();
        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    //тесты ручного изменения станции
    public void test6(){
        Radio radio = new Radio();
        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //Тест кнопки +
    public void test7(){
        Radio radio = new Radio();

        radio.setRadioStation(9);
        radio.setNext();


        int expected = 0;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Тест кнопки +
    public void test8(){
        Radio radio = new Radio();

        radio.setRadioStation(8);
        radio.setNext();


        int expected = 9;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Тест кнопки +
    public void test9(){
        Radio radio = new Radio();

        radio.setRadioStation(7);
        radio.setNext();


        int expected = 8;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Тест кнопки +
    public void test10(){
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.setNext();


        int expected = 1;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    //Тест кнопки -
    public void test11(){
        Radio radio = new Radio();

        radio.setRadioStation(9);
        radio.setPrev();


        int expected = 8;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Тест кнопки -
    public void test12(){
        Radio radio = new Radio();

        radio.setRadioStation(8);
        radio.setPrev();


        int expected = 7;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Тест кнопки -
    public void test13(){
        Radio radio = new Radio();

        radio.setRadioStation(7);
        radio.setPrev();


        int expected = 6;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Тест кнопки -
    public void test14(){
        Radio radio = new Radio();

        radio.setRadioStation(2);
        radio.setPrev();


        int expected = 1;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Тест кнопки -
    public void test15(){
        Radio radio = new Radio();

        radio.setRadioStation(1);
        radio.setPrev();


        int expected = 0;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Тест кнопки -
    public void test16(){
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.setPrev();


        int expected = 9;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //кнопка громкости -
    public void test17(){
        Radio radio = new Radio();

        radio.setRadioVolume(0);
        radio.minVolume();


        int expected = 0;
        int actual = radio.getRadioVolume();
        assertEquals(expected, actual);
    }
    @Test
    //кнопка громкости -
    public void test18(){
        Radio radio = new Radio();

        radio.setRadioVolume(1);
        radio.minVolume();


        int expected = 0;
        int actual = radio.getRadioVolume();
        assertEquals(expected, actual);
    }
    @Test
    //кнопка громкости -
    public void test19(){
        Radio radio = new Radio();

        radio.setRadioVolume(2);
        radio.minVolume();


        int expected = 1;
        int actual = radio.getRadioVolume();
        assertEquals(expected, actual);
    }
    @Test
    //кнопка громкости -
    public void test444(){
        Radio radio = new Radio();

        radio.setRadioVolume(3);
        radio.minVolume();


        int expected = 2;
        int actual = radio.getRadioVolume();
        assertEquals(expected, actual);
    }
    @Test
    //кнопка громкости +
    public void test20(){
        Radio radio = new Radio();

        radio.setRadioVolume(8);
        radio.maxVolume();


        int expected = 9;
        int actual = radio.getRadioVolume();
        assertEquals(expected, actual);
    }
    @Test
    //кнопка громкости +
    public void test21(){
        Radio radio = new Radio();

        radio.setRadioVolume(9);
        radio.maxVolume();


        int expected = 10;
        int actual = radio.getRadioVolume();
        assertEquals(expected, actual);
    }
    @Test
    //кнопка громкости +
    public void test22(){
        Radio radio = new Radio();

        radio.setRadioVolume(10);
        radio.maxVolume();


        int expected = 10;
        int actual = radio.getRadioVolume();
        assertEquals(expected, actual);
    }


}