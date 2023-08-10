package creational.singleton.eager;

public class DriverClass {
    public static void main(String[] args) {
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        eagerInitialization.setClassName("Temp class name");


        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        eagerInitialization1.setClassName("Temp class name 2");
        System.out.println(eagerInitialization.getClassName());
    }
}
