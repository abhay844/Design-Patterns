package creational.singleton.staticblock;

public class StaticBlockInitialization {
    private static StaticBlockInitialization staticBlockInitialization;

    static {
        try {
            staticBlockInitialization = new StaticBlockInitialization();
        }
        catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private StaticBlockInitialization(){
    }

    public static StaticBlockInitialization getInstance(){
        return staticBlockInitialization;
    }
}
