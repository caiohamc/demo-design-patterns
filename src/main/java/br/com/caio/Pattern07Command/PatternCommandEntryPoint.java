package br.com.caio.Pattern07Command;

import br.com.caio.Pattern07Command.concretecommands.OrderDrinkConcreteCommand;
import br.com.caio.Pattern07Command.concretecommands.OrderFoodConcreteCommand;
import br.com.caio.Pattern07Command.interfaces.ICommand;
import br.com.caio.Pattern07Command.invokers.OrdersInvoker;
import br.com.caio.Pattern07Command.receivers.DrinkPrepairerReceiver;
import br.com.caio.Pattern07Command.receivers.FoodPrepairerReceiver;

public class PatternCommandEntryPoint {
    public static void main(String[] args) {
        ICommand commandA = new OrderDrinkConcreteCommand(new DrinkPrepairerReceiver("Caio"), "Fanta");
        ICommand commandB = new OrderFoodConcreteCommand(new FoodPrepairerReceiver("Gilvandro"), "Carpaccio");
        ICommand commandC = new OrderDrinkConcreteCommand(new DrinkPrepairerReceiver("Kevin"), "Coca");
        ICommand commandD = new OrderFoodConcreteCommand(new FoodPrepairerReceiver("Ruth"), "Pizza");

        OrdersInvoker invoker = new OrdersInvoker();
        invoker.addOrder(commandA);
        invoker.addOrder(commandB);
        invoker.addOrder(commandC);
        invoker.addOrder(commandD);
        //invoker.cancelOrder(commandC);
        invoker.executeBatchOrders();
    }
}
