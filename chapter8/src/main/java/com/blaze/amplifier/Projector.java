package com.blaze.amplifier;

public abstract class Projector {
    private StreamingPlayer player;

    public abstract void on();

    public abstract void off();

    public abstract void tvMode();

    public abstract void wideScreenMode();

    public abstract String toString();
}
