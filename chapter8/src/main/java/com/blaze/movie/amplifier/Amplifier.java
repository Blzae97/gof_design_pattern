package com.blaze.movie.amplifier;

public abstract class Amplifier {
    private Tuner tuner;
    private StreamingPlayer player;

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public abstract void on();

    public abstract void off();

    public abstract void setStereoSound();

    public abstract void setSurroundSound();

    public abstract void setVolume(int value);

    public abstract String toString();

}
