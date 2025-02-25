class VendingMachine {
    private VendingMachineState state;
    private int balance;
    private int itemPrice = 50; 
    
    public VendingMachine() {
        this.state = new IdleState();
        this.balance = 0;
    }
    
    public void setState(VendingMachineState state) {
        this.state = state;
    }
    
    public void selectItem() {
        state.selectItem(this);
    }
    
    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }
    
    public void dispenseItem() {
        state.dispenseItem(this);
    }
    
    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }
    
    public void addBalance(int amount) {
        this.balance += amount;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public int getItemPrice() {
        return itemPrice;
    }
    
    public void dispense() {
        System.out.println("Item dispensed successfully.");
        this.balance -= itemPrice;
    }
}