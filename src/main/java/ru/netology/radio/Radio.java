package ru.netology.radio;

public class Radio {
    private int radioStation;
    private int radioVolume;
    private int maxStations = 10 - 1;

    public Radio() {
    }

    public Radio(int maxStations) {

        this.maxStations = maxStations - 1;
    }

    public int getRadioStation(int radioStation) {
        return this.radioStation;
    }

    public int setRadioStation(int radioStation) {
        if (radioStation < 0) {
            radioStation = maxStations;
        }
        if (radioStation > maxStations) {
            radioStation = 0;
        }
        this.radioStation = radioStation;

        return radioStation;
    }

    public void setNext() {
        setRadioStation(radioStation = radioStation + 1);
    }

    public void setPrev() {
        setRadioStation(radioStation = radioStation - 1);
    }


    public int getRadioVolume(int radioVolume) {
        return this.radioVolume;
    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < 0) {
            radioVolume = 0;
        }
        if (radioVolume > 100) {
            radioVolume = 100;
        }
        this.radioVolume = radioVolume;

    }

    public void minVolume() {
        setRadioVolume(radioVolume = radioVolume - 1);
    }

    public void maxVolume() {
        setRadioVolume(radioVolume = radioVolume + 1);
    }


}




