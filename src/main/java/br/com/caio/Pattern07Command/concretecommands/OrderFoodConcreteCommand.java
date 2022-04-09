package br.com.caio.Pattern07Command.concretecommands;

import br.com.caio.Pattern07Command.interfaces.ICommand;
import br.com.caio.Pattern07Command.receivers.FoodPrepairerReceiver;

public class OrderFoodConcreteCommand implements ICommand {
    private FoodPrepairerReceiver foodPrepairerReceiver;
    private String foodName;

    public OrderFoodConcreteCommand(FoodPrepairerReceiver foodPrepairerReceiver, String foodName) {
        this.foodPrepairerReceiver = foodPrepairerReceiver;
        this.foodName = foodName;
    }

    @Override
    public void execute() {
        foodPrepairerReceiver.prepareFood(foodName);
    }
}
