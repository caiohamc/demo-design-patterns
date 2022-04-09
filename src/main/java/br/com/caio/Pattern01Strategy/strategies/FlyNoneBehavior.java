package br.com.caio.Pattern01Strategy.strategies;

import br.com.caio.Pattern01Strategy.interfaces.IFlyBehavior;

public class FlyNoneBehavior implements IFlyBehavior {
    @Override
    public String fly() {
        return "No fly";
    }
}
