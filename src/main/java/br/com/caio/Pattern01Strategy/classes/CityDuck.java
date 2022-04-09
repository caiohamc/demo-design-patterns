package br.com.caio.Pattern01Strategy.classes;

import br.com.caio.Pattern01Strategy.strategies.*;

public class CityDuck extends Duck{

    public CityDuck(){
        displayBehavior = new DisplaySimpleBehavior(); // city ducks display simple
        flyBehavior = new FlyNoneBehavior(); // city ducks don't fly
        quackBehavior = new QuackNoneBehavior(); // city ducks quack complex
    }
}