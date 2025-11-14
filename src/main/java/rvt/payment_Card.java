package rvt;

public class payment_Card {

    private double balance;

    public payment_Card(double openingBalance){
        balance = openingBalance;
        
    }

    public void addMoney(double amount){
        if (amount > 0){
            balance += amount;
        }
        
    }

    

    public void eatAffordably() {
        if (balance >= 2.60){
            balance -= 2.60;
        }
        
    }

    public void eatHeartily() {
        if (balance >= 4.60){
            balance -= 4.60;
        }
            
    }

    public String toString(){
        
        String string = "The card has balance of " + balance + " euros";

        return string;

    }


public static void main(String[] args) {
        

        payment_Card paulsCard = new payment_Card(20);

        payment_Card mattsCard = new payment_Card(30);

        mattsCard.eatAffordably();
        paulsCard.eatHeartily();
        
        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println(paulsCard);
        System.out.println(mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        System.out.println(paulsCard);
        System.out.println(mattsCard);
}

}