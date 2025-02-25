public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        machine.selectItem();
        machine.insertCoin(25);
        machine.insertCoin(30);
        machine.dispenseItem();
        machine.selectItem();
        machine.setOutOfOrder();
        machine.insertCoin(50);
    }
}