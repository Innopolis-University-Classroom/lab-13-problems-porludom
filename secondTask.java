import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class secondTask {

}

class CarState{

}
class Car{
    private CarState state;

    public void setState(Memento memento){
        state = memento.carState;
    }
    public Memento getState(){
        return new Memento(state);
    }

}

class Memento{
    public CarState carState;

    public Memento(CarState carState) {
        this.carState = carState;
    }
}

class Mechanic{
    Memento memento;
    public void saveState(Car car){
        memento = car.getState();
    }
    public Memento getState(){
        return memento;
    }
}

