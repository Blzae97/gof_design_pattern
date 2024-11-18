package com.blaze.remotecontroller.command.stereo;

import com.blaze.remotecontroller.command.Command;
import com.blaze.remotecontroller.temp.Stereo;

public class StereoOffCommand extends Command {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
