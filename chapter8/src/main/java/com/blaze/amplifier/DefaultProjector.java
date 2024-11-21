package com.blaze.amplifier;

public class DefaultProjector extends Projector {

    @Override
    public void on() {
        System.out.println("프로젝터가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("프로젝터가 꺼졌습니다.");
    }

    @Override
    public void tvMode() {
        System.out.println("프로젝터를 화면 비율을 tv모드로 설정합니다.");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("프로젝터 화면 비율을 와이드 모드로 설정합니다.");
    }

    @Override
    public String toString() {
        return "기본 프로젝터 입니다.";
    }
}
