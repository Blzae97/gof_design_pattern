package com.blaze.remotecontroller.invoker;

import com.blaze.remotecontroller.command.Command;
import com.blaze.remotecontroller.command.NoCommand;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommandArray;
    Command[] offCommandArray;

    public RemoteControl() {
        onCommandArray = new Command[7];
        offCommandArray = new Command[7];

        for(int i = 0; i < 7; i++){
            onCommandArray[i] = new NoCommand();
            offCommandArray[i] = new NoCommand();
        }
    }

    public void settingButton(int slot, Command onCommand, Command offCommand) {
        onCommandArray[slot] = onCommand;
        offCommandArray[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommandArray[slot].execute();
    }

    public void offButtonPushed(int slot) {
        offCommandArray[slot].execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommandArray=" + Arrays.toString(onCommandArray) +
                ", offCommandArray=" + Arrays.toString(offCommandArray) +
                '}';
    }
}
