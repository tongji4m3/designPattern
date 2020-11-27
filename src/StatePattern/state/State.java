package StatePattern.state;

public interface State {
//    投入硬币
    void insertQuarter();
//    要求机器退钱
    void ejectQuarter();
//    转动曲柄
    void turnQuarter();
//    分配糖果
    void dispense();
}
