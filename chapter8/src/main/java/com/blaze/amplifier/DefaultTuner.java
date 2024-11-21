package com.blaze.amplifier;

public class DefaultTuner extends Tuner {

    @Override
    public void on() {
        System.out.println("튜너가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("튜너가 꺼졌습니다.");
    }

    @Override
    public void setAm() {
        System.out.println("튜너가 AM 모드로 설정되었습니다.");
    }

    @Override
    public void setFm() {
        System.out.println("튜너가 FM 모드로 설정되었습니다.");
    }

    @Override
    public void setFrequency() {
        System.out.println("튜너의 주파수가 설정되었습니다.");
    }

    @Override
    public String toString() {
        return "기본 튜너입니다.";
    }
}

