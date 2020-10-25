package TemplatePattern;

import javax.swing.table.TableRowSorter;

public abstract class CaffeineBeverageWithHook
{
    void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        //钩子方法改变的行为
        if(customerWantsCondiments())
        {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater()
    {
        System.out.println("boilWater");
    }

    void pourInCup()
    {
        System.out.println("pourInCup");
    }

    //一个钩子方法,子类可以通过他改变模板的行为
    boolean customerWantsCondiments()
    {
        return true;
    }
}
