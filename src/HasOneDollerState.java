class HasOneDollarState implements State {
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Already have one dollar.");
    }

    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Returning money without chenging dollers.");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Releasing product for venders.");
        vendingMachine.doReleaseProduct();
        if (vendingMachine.getCount() > 1) {
            vendingMachine.setState(vendingMachine.getIdleState());
        } else {
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    }
}