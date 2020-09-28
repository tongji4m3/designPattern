package FactoryPattern;

public class MainTest
{
    public static void main(String[] args)
    {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        Pizza pizza2 = chicagoStore.orderPizza("cheese");

    }
}
