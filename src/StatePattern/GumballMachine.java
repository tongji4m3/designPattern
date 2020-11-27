package StatePattern;

import StatePattern.state.*;

//糖果机
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State soldState;
    private State hasQuarterState;

    private State winnerState;


    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState=new WinnerState(this);

        this.count = numberGumballs;

        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }


    //    投入硬币
    public void insertQuarter() {
        state.insertQuarter();
    }

    //    要求机器退钱
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    //    转动曲柄
    public void turnQuarter() {
        state.turnQuarter();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("a gumball comes rolling out the slot");
        if (count != 0) {
            --count;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
