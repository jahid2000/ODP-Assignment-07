
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        vendingMachine.insertDollar();
        vendingMachine.dispense();

        vendingMachine.insertDollar();
        vendingMachine.ejectMoney();


    }
}