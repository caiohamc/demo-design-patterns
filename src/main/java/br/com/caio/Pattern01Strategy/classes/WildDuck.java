package br.com.caio.Pattern01Strategy.classes;

import br.com.caio.Pattern01Strategy.strategies.*;

public class WildDuck extends Duck{

    public WildDuck(){
        displayBehavior = new DisplayComplexBehavior(); // wild ducks display complex
        flyBehavior = new FlyNoneBehavior(); // wild ducks don't fly
        quackBehavior = new QuackComplexBehavior(); // wild ducks quack complex
    }
}