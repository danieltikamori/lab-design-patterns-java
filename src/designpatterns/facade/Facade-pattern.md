# Facade design pattern in Java

Provide a unified interface to a set of interfaces in a subsystem. Facade Pattern defines a higher-level interface that makes the subsystem easier to use.

## When to use?

When you create a simplified interface that performs many other actions behind the scenes.

## Use Cases

* Hide the complexity of a subsystem from the client.
* Provide a single point of access to a subsystem.
* Provide a unified interface to a set of interfaces in a subsystem.

### [Facade Design Pattern Important Points](https://www.digitalocean.com/community/tutorials/facade-design-pattern-in-java#facade-design-pattern-important-points)[](https://www.digitalocean.com/community/tutorials/facade-design-pattern-in-java#facade-design-pattern-important-points)

- Facade design pattern is more like a helper for client applications, it does not hide subsystem interfaces from the client. Whether to use Facade or not is completely dependent on client code.
- Facade design pattern can be applied at any point of development, usually when the number of interfaces grow and system gets complex.
- Subsystem interfaces are not aware of Facade, and they shouldn’t have any reference of the Facade interface.
- Facade design pattern should be applied for similar kind of interfaces, its purpose is to provide a single interface rather than multiple interfaces that does the similar kind of jobs.
- We can use [Factory pattern](https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java "Factory Design Pattern in Java") with Facade to provide better interface to client systems.