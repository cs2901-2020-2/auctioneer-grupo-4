package cs.lab;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public List<Observer> getObservers() {
        return this.observers;
    }
    
}
    
