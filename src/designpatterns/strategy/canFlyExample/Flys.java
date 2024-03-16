// This package contains classes related to the strategy design pattern
package designpatterns.strategy.canFlyExample;

// The Flys interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Flys.
// 
// Classes that implement new Flys interface
// subclasses can allow other classes to use
// that code eliminating code duplication
// 
// I'm decoupling : encapsulating the concept that varies
public interface Flys {

    // The fly method represents the behavior of flying
    // It can be implemented by different classes to represent different types of flying
    String fly();

}

// Class used if the Animal can fly
class ItFlys implements Flys{

    // The fly method returns a string indicating that the animal is flying high
    public String fly() {
        return "Flying High";
    }

}

// Class used if the Animal can't fly
class CantFly implements Flys{

    // The fly method returns a string indicating that the animal can't fly
    public String fly() {
        return "I can't fly";
    }

}