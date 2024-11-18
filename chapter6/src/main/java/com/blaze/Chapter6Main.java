package com.blaze;

import com.blaze.remotecontroller.command.light.LightOffCommand;
import com.blaze.remotecontroller.command.light.LightOnCommand;
import com.blaze.remotecontroller.command.stereo.StereoOffCommand;
import com.blaze.remotecontroller.command.stereo.StereoOnCommand;
import com.blaze.remotecontroller.invoker.RemoteControl;
import com.blaze.remotecontroller.temp.Light;
import com.blaze.remotecontroller.temp.Stereo;

public class Chapter6Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        System.out.println(remoteControl.toString());

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.settingButton(0, lightOnCommand, lightOffCommand);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.settingButton(1, stereoOnCommand, stereoOffCommand);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);

        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
    }
}