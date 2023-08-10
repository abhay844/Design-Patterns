package creational.singleton.eager;

public class EagerInitialization {

    String className;
    private static EagerInitialization eagerInitialization = new EagerInitialization();

    // Make constructor private so that client applications using constructor
    private EagerInitialization(){

    }


    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName(){
        return this.className;
    }
}
