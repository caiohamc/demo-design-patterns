package br.com.caio.Pattern02Observable.interfaces;

public interface IObservable {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers();
}
