package com.blaze.amplifier;

public class DefaultAmplifier extends Amplifier {

    public DefaultAmplifier() {
    }

    @Override
    public void on() {
        System.out.println("앰프가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("앰프가 꺼졌습니다.");
    }

    @Override
    public void setStereoSound() {
        System.out.println("스트레오 모드로 설정합니다.");
    }

    @Override
    public void setSurroundSound() {
        System.out.println("서라운드 모드로 설정합니다.");
    }

    @Override
    public void setVolume(int value) {
        System.out.println("앰프 볼륨을 " + value + "로 설정합니다.");
    }

    @Override
    public String toString() {
        return "기본 앰프 입니다.";
    }
}
