package com.blaze.movie.theaterlights;

public class DefaultTheaterLights extends TheaterLights {

    @Override
    public void on() {
        System.out.println("조명을 킵니다.");
    }

    @Override
    public void off() {
        System.out.println("조명을 끕니다.");
    }

    @Override
    public void dim(int value) {
        System.out.println("조명 밝기를 10%로 설정합니다.");
    }

    @Override
    public String toString() {
        return "기본 극장 조명";
    }
}
