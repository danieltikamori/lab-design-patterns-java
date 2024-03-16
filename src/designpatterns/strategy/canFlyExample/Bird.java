package designpatterns.strategy.canFlyExample;

/**
 * A class representing a Bird, which is a type of Animal.
 */
public class Bird extends Animal{

    // The constructor initializes all objects

    /**
     * Constructor for Bird class. Initializes the sound and flying type.
     */
    public Bird(){
        super();
        setSound("Tweet");

        // We set the Flys interface polymorphically
        // This sets the behavior as a non-flying Animal
        flyingType = new ItFlys();
    }
}