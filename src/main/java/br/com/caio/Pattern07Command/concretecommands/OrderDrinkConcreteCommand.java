package br.com.caio.Pattern07Command.concretecommands;

import br.com.caio.Pattern07Command.receivers.DrinkPrepairerReceiver;
import br.com.caio.Pattern07Command.interfaces.ICommand;

public class OrderDrinkConcreteCommand implements ICommand {
    private DrinkPrepairerReceiver receiver;
    private String drinkName;

    public OrderDrinkConcreteCommand(DrinkPrepairerReceiver receiver, String drinkName) {
        this.receiver = receiver;
        this.drinkName = drinkName;
    }

    @Override
    public void execute() {
        receiver.prepareDrink(drinkName);
    }
}
