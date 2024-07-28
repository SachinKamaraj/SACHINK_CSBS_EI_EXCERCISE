package com.example;

import com.example.util.LoggingUtility;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SurroundSoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SurroundSoundSystem soundSystem, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        LoggingUtility.log("Setting up to watch a movie...");
        lights.dim();
        projector.on();
        soundSystem.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
        LoggingUtility.log("Movie is playing: " + movie);
    }

    public void endMovie() {
        LoggingUtility.log("Shutting down movie theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.brighten();
    }
}
