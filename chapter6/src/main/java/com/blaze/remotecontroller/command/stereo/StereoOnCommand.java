package com.blaze.remotecontroller.command.stereo;

import com.blaze.remotecontroller.command.Command;
import com.blaze.remotecontroller.temp.Stereo;

public class StereoOnCommand extends Command {
    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }
}
