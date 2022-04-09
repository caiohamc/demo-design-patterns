package br.com.caio.Pattern02Observable.classes;

import br.com.caio.Pattern02Observable.interfaces.IObserver;

public class PhoneObserver implements IObserver {

    private WeatherStationObservable weatherStationObservable;

    public PhoneObserver(WeatherStationObservable weatherStationObservable){
        this.weatherStationObservable = weatherStationObservable;
    }

    @Override
    public void update() {
        this.weatherStationObservable.getTemperature();
    }
}
