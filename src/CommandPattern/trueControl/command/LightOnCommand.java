package CommandPattern.trueControl.command;


import CommandPattern.trueControl.model.Light;

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

    public void undo()
    {
        light.off();
    }
}
