package br.com.caio.Pattern02Observable.classes;

import br.com.caio.Pattern02Observable.interfaces.IObservable;
import br.com.caio.Pattern02Observable.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements IObservable {
    private List<IObserver> observers = new ArrayList<>();

    // property used to update
    private int temperature;

    public WeatherStationObservable(List<IObserver> observers, int temperature) {
        this.observers = observers;
        this.temperature = temperature;
    }

    @Override
    public void register(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        this.observers.remove(o);
        System.out.println("");
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    public int getTemperature() {
        return temperature;
    }
}
