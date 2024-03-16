package designpatterns.strategy.canFlyExample;

// Dog class, extends Animal
public class Dog extends Animal{

    // Method to make the dog dig a hole
    public void digHole(){
        System.out.println("Dug a hole");
    }

    // Constructor for Dog class
    public Dog(){
        super(); // Call the superclass constructor
        setSound("Bark"); // Set the sound of the dog to "Bark"

        // Set the flying behavior to non-flying using the CantFly class
        flyingType = new CantFly();
    }

    /*
    * BAD
    * You could override the fly method, but we are breaking
    * the rule that we need to abstract what is different to
    * the subclasses
    *
    // Method to make the dog fly
    public void fly(){
        System.out.println("I can't fly");
    }
    */
}