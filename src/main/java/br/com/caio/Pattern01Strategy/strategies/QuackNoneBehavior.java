package br.com.caio.Pattern01Strategy.strategies;

import br.com.caio.Pattern01Strategy.interfaces.IQuackBehavior;

public class QuackNoneBehavior implements IQuackBehavior {
    @Override
    public String quack() {
        return "None quack";
    }
}
