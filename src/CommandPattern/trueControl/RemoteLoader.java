package CommandPattern.trueControl;

import CommandPattern.trueControl.command.LightOffCommand;
import CommandPattern.trueControl.command.LightOnCommand;
import CommandPattern.trueControl.model.Light;

public class RemoteLoader
{
    public static void main(String[] args)
    {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        LightOnCommand livingOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenOffCommand = new LightOffCommand(kitchenLight);

        remoteControl.setCommand(0, livingOnCommand, livingOffCommand);
        remoteControl.setCommand(1, kitchenOnCommand, kitchenOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        System.out.println("------------------------");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        /*
        light on Living Room
        light off Living Room
        light on Living Room
        ------------------------
        light on Kitchen
        light off Kitchen
        light on Kitchen
         */

    }
}
