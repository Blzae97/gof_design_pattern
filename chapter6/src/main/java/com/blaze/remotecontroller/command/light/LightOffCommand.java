package com.blaze.remotecontroller.command.light;

import com.blaze.remotecontroller.command.Command;
import com.blaze.remotecontroller.temp.Light;

public class LightOffCommand extends Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
