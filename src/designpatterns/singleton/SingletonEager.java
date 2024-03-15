package designpatterns.singleton;

/**
 * Eager Singleton
 * @author Daniel Tikamori on 2024/03/15
 */

//Thread safe in terms of instance creation - Yes, because static instances are only created once when the class is loaded.
//Memory usage is not optimal since the singleton is created when the class is loaded and not when it is used.
//Does not prevent the singleton from being serialized and deserialized. Use readResolve() to prevent the instance from being serialized.


public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager(); // Singleton instance being created on demand.

    private SingletonEager() { // Singleton constructor must be private to prevent instantiation from outside.
        super(); // optional super() call, it is here to just make explicit.
    }

    public static SingletonEager getInstance() { // Static method to get the self singleton instance.
        return instance;
    }
    private Object readResolve() { // Prevents the instance from being serialized.
        return getInstance();
    }

// Enums are immune to serialization and reflection. Can be used alternatively to prevent the instance from being serialized.
//    public enum Singleton {
//        INSTANCE;
//        public void doSomething() {
//        }
//    }

}
