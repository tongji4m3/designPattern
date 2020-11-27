package StatePattern.state;

import StatePattern.GumballMachine;

public class SoldOutState implements State {
    //对糖果机的引用
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("you can't insert a quarter,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnQuarter() {
        System.out.println("You turned,but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
