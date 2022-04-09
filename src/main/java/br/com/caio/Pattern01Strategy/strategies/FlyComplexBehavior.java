package br.com.caio.Pattern01Strategy.strategies;

import br.com.caio.Pattern01Strategy.interfaces.IFlyBehavior;

public class FlyComplexBehavior implements IFlyBehavior {
    @Override
    public String fly() {
        return "Complex fly";
    }
}
