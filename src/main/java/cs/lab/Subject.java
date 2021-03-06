package cs.lab;

import java.util.List;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    public List<Observer> getObservers();
}
