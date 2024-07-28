package com.example;

import com.example.util.LoggingUtility;

public class DVDPlayer {
    public void on() {
        LoggingUtility.log("DVD Player is on.");
    }

    public void play(String movie) {
        LoggingUtility.log("Playing movie: " + movie);
    }

    public void off() {
        LoggingUtility.log("DVD Player is off.");
    }
}

