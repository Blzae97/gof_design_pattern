package com.blaze.amplifier;

public abstract class Tuner {
    private Amplifier amplifier;

    public abstract void on();

    public abstract void off();

    public abstract void setAm();

    public abstract void setFm();

    public abstract void setFrequency();

    public abstract String toString();

}
