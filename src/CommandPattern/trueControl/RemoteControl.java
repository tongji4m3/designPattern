package CommandPattern.trueControl;

import CommandPattern.trueControl.command.Command;
import CommandPattern.trueControl.command.NoCommand;

import java.util.Arrays;

public class RemoteControl
{
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;//用于实现撤销操作

    public RemoteControl()
    {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    //留待以后扩展指令
    public void setCommand(int slot,Command onCommand,Command offCommand)
    {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot)
    {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed()
    {
        undoCommand.undo();
    }

    @Override
    public String toString()
    {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
