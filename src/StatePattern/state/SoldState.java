package StatePattern.state;

import StatePattern.GumballMachine;

public class SoldState implements State {
    //对糖果机的引用
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait,we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you already turned the crank");
    }

    @Override
    public void turnQuarter() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else {
            System.out.println("oops,out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
