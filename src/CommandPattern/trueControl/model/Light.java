package CommandPattern.trueControl.model;

public class Light
{
    private String name;

    public Light()
    {
    }

    public Light(String name)
    {
        this.name = name;
    }

    public void on()
    {
        System.out.println("light on " + this.name);
    }

    public void off()
    {
        System.out.println("light off " + this.name);
    }
}
