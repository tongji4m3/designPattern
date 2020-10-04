package CommandPattern.trueControl.command;

import CommandPattern.simpleControl.command.Command;
import CommandPattern.simpleControl.model.Light;

public class LightOnCommand implements Command
{
    Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.on();
    }
}
