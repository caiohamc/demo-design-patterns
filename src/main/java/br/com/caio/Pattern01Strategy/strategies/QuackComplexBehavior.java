package br.com.caio.Pattern01Strategy.strategies;

import br.com.caio.Pattern01Strategy.interfaces.IQuackBehavior;

public class QuackComplexBehavior implements IQuackBehavior {
    @Override
    public String quack() {
        return "Complex quack";
    }
}
