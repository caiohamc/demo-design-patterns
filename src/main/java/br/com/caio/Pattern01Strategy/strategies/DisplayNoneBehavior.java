package br.com.caio.Pattern01Strategy.strategies;

import br.com.caio.Pattern01Strategy.interfaces.IDisplayBehavior;

public class DisplayNoneBehavior implements IDisplayBehavior {
    @Override
    public String display() {
        return "None display";
    }
}
