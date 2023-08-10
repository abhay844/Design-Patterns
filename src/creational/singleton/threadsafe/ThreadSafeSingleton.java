package creational.singleton.threadsafe;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){

    }

    public synchronized static ThreadSafeSingleton getInstance(){
        if (threadSafeSingleton == null) {
            return new ThreadSafeSingleton();
        }

        return threadSafeSingleton;
    }
}
