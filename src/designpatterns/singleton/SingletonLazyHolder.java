package designpatterns.singleton;

/**
 * Lazy Holder Singleton
 * @author Daniel Tikamori on 2024/03/15
 */

// Recommended use of Lazy Holder Singleton: https://en.wikipedia.org/wiki/Initialization_on_demand_holder_idiom

class SingletonLazyHolder {
    private static class InstanceHolder { // Singleton instance holder, encapsulates the instance. Inner class.
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder(); // Static instance of the Singleton.
    }
    private SingletonLazyHolder() { // Singleton constructor must be private to prevent instantiation from outside.
        super(); // optional super() call, it is here to just make explicit.
    }
    public static SingletonLazyHolder getInstance() { // Static method to get the self singleton instance.
        return InstanceHolder.INSTANCE;
    }
    private Object readResolve() { // Prevents SingletonLazyHolder from being serialized.
        return getInstance();
    }

// Enums are immune to serialization and reflection. Can be used alternatively to prevent the instance from being serialized.
//    public enum Singleton {
//        INSTANCE;
//        public void doSomething() {
//        }
//    }
}