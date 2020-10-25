package TemplatePattern;

public class CoffeeWithHook extends CaffeineBeverageWithHook
{
    @Override
    void brew()
    {
        System.out.println("CoffeeWithHook brew");
    }

    @Override
    void addCondiments()
    {
        System.out.println("CoffeeWithHook addCondiments");
    }

    @Override
    boolean customerWantsCondiments()
    {
        //这里可以用一些逻辑来控制该钩子,此处省略
        return true;
    }
}
