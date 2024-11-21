package com.blaze.movie.screen;

public class DefaultScreen extends Screen {
    @Override
    public void up() {
        System.out.println("스크린이 올라갑니다.");
    }

    @Override
    public void down() {
        System.out.println("스크린이 내려갑니다.");
    }

    @Override
    public String toString() {
        return "기본 스크린";
    }
}
