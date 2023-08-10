package creational.singleton.enumsingleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething(){
        System.out.println("Using Enum Singleton design pattern");
    }

}
