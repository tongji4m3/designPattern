package IteratorAndCompositePattern.menu;

import IteratorAndCompositePattern.iterator.NullIterator;

import java.util.Iterator;

//菜单项
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    //迭代器相关操作
    //叶节点无迭代器
    @Override
    public Iterator createIterator(){
        return new NullIterator();
    }

    public void print(){
        System.out.print(" "+getName());
        if(isVegetarian())
        {
            System.out.print("(v)");
        }
        System.out.println(", "+getPrice());
        System.out.println("   -- "+getDescription());
    }
}
