package com.blaze.amplifier;

public abstract class StreamingPlayer {
    private Amplifier amplifier;

    public void setSurroundAudio(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void setTwoChannelAudio(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public abstract void on();

    public abstract void off();

    public abstract void pause();

    public abstract void play(String value);

    public abstract void stop(String value);

    public abstract String toString();
}
