# Strategy pattern

The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently of the clients that use it.

The Strategy Design Pattern is a powerful tool in Java that allows for dynamic changes and encapsulates varying behaviors without affecting the main class. Here’s how it works:

## What is the Strategy Pattern?

The Strategy Pattern is a behavioral design pattern that enables us to define a family of strategies, encapsulate each one of them, and make them interchangeable.
It promotes a clear separation of concerns, allowing clients to choose an appropriate strategy at runtime without altering their code1.

## How Does It Work?

Suppose you have an object that needs to perform a specific task (such as sorting, logging, or payment processing).
Instead of hardcoding the behavior directly into the object, you define a strategy interface that declares the method(s) for that behavior.
You create separate classes (implementations) for each strategy, each implementing the strategy interface.
At runtime, you can dynamically switch between different strategies by setting the appropriate implementation for the object2.

## Benefits of the Strategy Pattern:

Flexibility: You can easily add new strategies without modifying existing code.
Code Reusability: Strategies can be reused across different objects.
Testability: You can test each strategy independently.
Maintainability: Changes to one strategy don’t impact other parts of the code3.

## Example in Java:

Let’s say we’re building a payment system. We have different payment methods: credit card, PayPal, and bank transfer.
We create a PaymentStrategy interface with a pay method.
We implement three classes: CreditCardPayment, PayPalPayment, and BankTransferPayment, each providing its own payment logic.
Our main class can now switch between these payment methods dynamically based on user preferences or other factors4.

Remember, the Strategy Pattern is a valuable tool for creating flexible and maintainable code. It’s widely used in software development to handle varying behaviors effectively. 🚀

## Design principles

### Identify the parts of your program that vary and separate them from what stays the same.

The principle states to separate and “encapsulate” anything that changes frequently so that all the code that changes lives in one place. That way the code that changes will not have any effect on the rest of the program and our application is more flexible and robust.

### Program to an interface and not an implementation.

Instead of using the concrete classes we use variables that are supertypes of those classes. In other words, we use variables of type EatBehavior and BarkBehavior and assign these variables objects of classes that implement these behaviors. That way, the Dog classes do not need to have any information about the actual object types of those variables.