package creational.singleton.billpugh;

public class BillPughSingletonInitialization {

    String instanceVariable;

    private BillPughSingletonInitialization() {

    }

    public static BillPughSingletonInitialization getInstance() {
        return SingletonHelper.billPughSingletonInitialization;
    }

    public String getInstanceVariable() {
        return this.instanceVariable;
    }

    public void setInstanceVariable(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    private static class SingletonHelper {
        static {
            System.out.println("Static block is executed");
        }
        private static final BillPughSingletonInitialization billPughSingletonInitialization = new BillPughSingletonInitialization();
    }
}
