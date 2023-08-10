package creational.singleton.enumsingleton;

public class DriverClass {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.doSomething();
    }
}
