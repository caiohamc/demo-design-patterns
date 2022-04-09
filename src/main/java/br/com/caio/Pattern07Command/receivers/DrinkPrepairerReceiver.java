package br.com.caio.Pattern07Command.receivers;

public class DrinkPrepairerReceiver {
    private String receiverName;

    public DrinkPrepairerReceiver(String receiverName) {
        this.receiverName = receiverName;
    }

    public void prepareDrink(String drinkName){
        System.out.println(receiverName + " prepares " + drinkName);
    }
}
