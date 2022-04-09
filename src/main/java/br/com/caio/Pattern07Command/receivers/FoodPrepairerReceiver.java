package br.com.caio.Pattern07Command.receivers;

public class FoodPrepairerReceiver {
    private String receiverName;

    public FoodPrepairerReceiver(String receiverName) {
        this.receiverName = receiverName;
    }

    public void prepareFood(String foodName){
        System.out.println(receiverName + " prepares " + foodName);
    }
}
