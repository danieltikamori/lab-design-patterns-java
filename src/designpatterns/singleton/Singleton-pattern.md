# Singleton pattern

## Common use cases
- Logging - A singleton logger is used to log messages to a file.
- Database connection - A singleton database connection is used to connect to a database.
- Configuration - A singleton configuration object is used to store application configuration.
- Cache - A singleton cache is used to store application data.
If you are able to see a pattern here, these are all system-wide concerns. This makes understanding Singletons very important for any developer.

## Some important concerns while creating a singleton

1. **Thread safety** - Since singletons are created to be used by multiple threads, they need to be thread safe. Being thread safe can be viewed in two ways.
    - Ensure that the singleton is not created more than once
    - If the singleton holds data, like in a cache, ensure that the data is thread safe. Methods that update the data should be synchronized.
2. **Efficiency** - We need to ensure optimal memory usage and performance.
    - Memory leaks - If the singleton is heavy and is not used, it will consume a lot of memory.
    - Resource usage - If the singleton consumes system resources, it will consume a lot of CPU cycles. In this case, unless the singleton is used, the system will be underutilized.
3. **Deserialization** - If the singleton is serialized and deserialized, it will be recreated in which case multiple instances will be created. It is not common to serialize singletons however, it is important to understand this.


## Which singleton implementation is best for your use case?

- If memory is not an issue or the singleton instance is light, simply use an enum singleton.
- If memory is an issue, use a lazy initialization singleton.
 - Further if thread safety is an issue, use a double-checked locking singleton or a holder pattern.
 - Further if you need to prevent the singleton from being serialized, use a double-checked locking singleton with readResolve().