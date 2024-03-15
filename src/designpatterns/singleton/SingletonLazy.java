package designpatterns.singleton;

/**
 * Lazy Singleton
 * @author Daniel Tikamori on 2024/03/15
 */

// Not thread safe
// More memory efficient than SingletonEager. This means that the singleton is not created until the first time it is accessed.

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() { // Singleton constructor must be private to prevent instantiation from outside.
        super(); // optional super() call, it is here to just make explicit.
    }

    public static SingletonLazy getInstance() { // Static method to get the self singleton instance.
        if (instance == null) { // As the instance must be created only once, verify if the instance is already created first.
            instance = new SingletonLazy(); // If not, create it.
        }
        return instance;
    }
    private Object readResolve() { // Prevent serialization
        return getInstance();
    }

// Enums are immune to serialization and reflection. Can be used alternatively to prevent the instance from being serialized.
//    public enum Singleton {
//        INSTANCE;
//        public void doSomething() {
//        }
//    }
}
