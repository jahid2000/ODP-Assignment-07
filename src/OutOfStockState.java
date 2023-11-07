class OutOfStockState implements State {
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Cannot accept money.");
    }

    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return.");
    }

    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Cannot dispense.");
    }
}