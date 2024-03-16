package designpatterns.strategy.canFlyExample;

/**
 * This class demonstrates the use of the Strategy design pattern.
 */
public class AnimalPlay {

    /**
     * The main method of the program.
     * It creates two instances of the Animal class, one for a dog and one for a bird,
     * and calls their tryToFly() method to show how they fly.
     * It also demonstrates how to dynamically change the flying ability of the dog.
     */
    public static void main(String[] args) {

        // Create a dog
        Animal sparky = new Dog();
        // Create a bird
        Animal tweety = new Bird();

        // Print the result of tryToFly() for the dog
        System.out.println("Dog: " + sparky.tryToFly());

        // Print the result of tryToFly() for the bird
        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        // Change the flying ability of the dog to "ItFlys"
        sparky.setFlyingAbility(new ItFlys());

        // Print the result of tryToFly() for the dog after changing the flying ability
        System.out.println("Dog: " + sparky.tryToFly());

    }

}