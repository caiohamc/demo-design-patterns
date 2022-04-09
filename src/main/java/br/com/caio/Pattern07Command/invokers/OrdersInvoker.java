package br.com.caio.Pattern07Command.invokers;

import br.com.caio.Pattern07Command.interfaces.ICommand;

import java.util.ArrayList;
import java.util.List;

public class OrdersInvoker {
    private List<ICommand> orderCommandList = new ArrayList<>();

    public List<ICommand> getOrderCommandList() {
        return orderCommandList;
    }

    public void addOrder(ICommand order){
        orderCommandList.add(order);
    }

    public void cancelOrder(ICommand order){
        orderCommandList.remove(order);
    }

    public void executerOrder(ICommand order){
        order.execute();
        orderCommandList.remove(order);
    }

    public void executeBatchOrders() {
        orderCommandList.forEach(command -> command.execute());
        orderCommandList.clear();
    }
}
