package br.com.caio.Pattern01Strategy.strategies;

import br.com.caio.Pattern01Strategy.interfaces.IFlyBehavior;

public class FlySimpleBehavior implements IFlyBehavior {
    @Override
    public String fly() {
        return "Simple fly";
    }
}
