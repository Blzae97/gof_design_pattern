package com.blaze.amplifier;

public class DefaultStreamingPlayer extends StreamingPlayer {

    @Override
    public void on() {
        System.out.println("스트리밍 플레이어가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("스트리밍 플레이어가 꺼졌습니다.");
    }

    @Override
    public void pause() {
        System.out.println("스트리밍 플레이어가 정지되었습니다.");
    }

    @Override
    public void play(String value) {
        System.out.println("스트리밍 플레이에서\"" + value + "\"를 재생합니다.");
    }

    @Override
    public void stop(String value) {
        System.out.println("스트리밍 플레이에서\"" + value + "\"재생을 종료합니다.");
    }

    @Override
    public String toString() {
        return "기본 스트리밍 플레이어";
    }
}
