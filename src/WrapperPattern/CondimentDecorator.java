package WrapperPattern;

//调料装饰者
public abstract class CondimentDecorator extends Beverage
{
    //所有调料装饰者必须重新实现该方法
    public abstract String getDescription();
}
