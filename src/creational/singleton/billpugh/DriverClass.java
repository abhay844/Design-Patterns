package creational.singleton.billpugh;

public class DriverClass {
    public static void main(String[] args) {
        BillPughSingletonInitialization billPughSingletonInitialization = BillPughSingletonInitialization.getInstance();
        billPughSingletonInitialization.setInstanceVariable("Temp 1");
        System.out.println(billPughSingletonInitialization.getInstanceVariable());

        BillPughSingletonInitialization billPughSingletonInitialization1 = BillPughSingletonInitialization.getInstance();
        billPughSingletonInitialization1.setInstanceVariable("Temp 2");
        System.out.println(billPughSingletonInitialization.getInstanceVariable());
    }
}
