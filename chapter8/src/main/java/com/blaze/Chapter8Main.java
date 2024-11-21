package com.blaze;

import com.blaze.hometheater.HomeTheaterFacade;
import com.blaze.movie.amplifier.*;
import com.blaze.movie.popcorn.DefaultPopcornPopper;
import com.blaze.movie.popcorn.PopcornPopper;
import com.blaze.movie.screen.DefaultScreen;
import com.blaze.movie.screen.Screen;
import com.blaze.movie.theaterlights.DefaultTheaterLights;
import com.blaze.movie.theaterlights.TheaterLights;

public class Chapter8Main {
    public static void main(String[] args) {
        Amplifier amplifier = new DefaultAmplifier();
        Tuner tuner = new DefaultTuner();
        StreamingPlayer streamingPlayer = new DefaultStreamingPlayer();
        Projector projector = new DefaultProjector();
        Screen screen = new DefaultScreen();
        TheaterLights theaterLights = new DefaultTheaterLights();
        PopcornPopper popcornPopper = new DefaultPopcornPopper();

        HomeTheaterFacade homeTheaterFacade
                = new HomeTheaterFacade(amplifier, tuner, streamingPlayer, projector, theaterLights, screen, popcornPopper);

        homeTheaterFacade.watchMovie("인디아나 존스:레이더스");
        System.out.println("=============================");
        homeTheaterFacade.endMovie("인디아나 존스:레이더스");
    }
}