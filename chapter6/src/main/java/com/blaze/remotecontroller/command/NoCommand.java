package com.blaze.remotecontroller.command;

public class NoCommand extends Command {
    @Override
    public void execute() {
        System.out.println("아무 동작을 하지 않습니다.");
    }
}
