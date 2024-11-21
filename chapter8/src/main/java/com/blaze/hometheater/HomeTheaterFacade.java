package com.blaze.hometheater;

import com.blaze.amplifier.Amplifier;
import com.blaze.amplifier.Projector;
import com.blaze.amplifier.StreamingPlayer;
import com.blaze.amplifier.Tuner;
import com.blaze.popcorn.PopcornPopper;
import com.blaze.screen.Screen;
import com.blaze.theaterlights.TheaterLights;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final Tuner tuner;
    private final StreamingPlayer streamingPlayer;
    private final Projector projector;
    private final TheaterLights theaterLights;
    private final Screen screen;
    private final PopcornPopper popcornPopper;


    public HomeTheaterFacade(
            Amplifier amplifier,
            Tuner tuner,
            StreamingPlayer streamingPlayer,
            Projector projector,
            TheaterLights theaterLights,
            Screen screen,
            PopcornPopper popcornPopper
    ) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.streamingPlayer = streamingPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("영화 볼 준비 중");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(streamingPlayer);
        amplifier.setSurroundSound();
        streamingPlayer.on();
        streamingPlayer.play(movie);
    }

    public void endMovie(String movie) {
        System.out.println("홈시어터 끄는 중");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        streamingPlayer.stop(movie);
        streamingPlayer.off();
    }


}
