package com.blaze.movie.popcorn;

public class DefaultPopcornPopper extends PopcornPopper {
    @Override
    public void on() {
        System.out.println("팝콘 기계가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("팝콘 기계가 꺼졌습니다.");
    }

    @Override
    public void pop() {
        System.out.println("팝콘 기계에서 팝콘을 튀기고 있습니다.");
    }

    @Override
    public String toString() {
        return "기본 팝콘 기계";
    }
}
