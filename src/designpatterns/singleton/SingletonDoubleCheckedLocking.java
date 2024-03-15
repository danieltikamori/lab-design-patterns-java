package designpatterns.singleton;

/**
 * Double-Checked Locking Singleton
 * @author Daniel Tikamori on 2024/03/15
 */
public class SingletonDoubleCheckedLocking {

    private static volatile SingletonDoubleCheckedLocking instance = null;
    private SingletonDoubleCheckedLocking() { // Singleton constructor must be private to prevent instantiation from outside.
        super(); // optional super() call, it is here to just make explicit.
    }

    public static SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    public Object readResolve() { // Prevents the instance from being serialized.
        return getInstance();
    }

// Enums are immune to serialization and reflection. Can be used alternatively to prevent the instance from being serialized.
//    public enum Singleton {
//        INSTANCE;
//        public void doSomething() {
//        }
//    }
}
