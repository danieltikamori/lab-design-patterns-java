package designpatterns.strategy.canFlyExample;

// Abstract class representing an Animal
abstract class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    // Instead of using an interface in a traditional way
    // we use an instance variable that is a subclass
    // of the Flys interface.

    // Animal doesn't care what flyingType does, it just
    // knows the behavior is available to its subclasses

    // This is known as Composition : Instead of inheriting
    // an ability through inheritance the class is composed
    // with Objects with the right ability

    // Composition allows you to change the capabilities of
    // objects at run time!

    // Instance variable for the flying behavior
    public Flys flyingType;

    // Setter and getter methods for name
    public void setName(String newName){ name = newName; }
    public String getName(){ return name; }

    // Setter and getter methods for height
    public void setHeight(double newHeight){ height = newHeight; }
    public double getHeight(){ return height; }

    // Setter and getter methods for weight
    public void setWeight(int newWeight){
        if (newWeight > 0){
            weight = newWeight;
        } else {
            throw new IllegalArgumentException("Weight must be bigger than 0");
        }
    }
    public double getWeight(){ return weight; }

    // Setter and getter methods for favorite food
    public void setFavFood(String newFavFood){ favFood = newFavFood; }
    public String getFavFood(){ return favFood; }

    // Setter and getter methods for speed
    public void setSpeed(double newSpeed){ speed = newSpeed; }
    public double getSpeed(){ return speed; }

    // Setter and getter methods for sound
    public void setSound(String newSound){ sound = newSound; }
    public String getSound(){ return sound; }

    /* BAD
    * You don't want to add methods to the super class.
    * You need to separate what is different between subclasses
    * and the super class
    public void fly(){

    System.out.println("I'm flying");

    }
    */

    // Animal pushes off the responsibility for flying to flyingType

    // Method to try flying based on the flyingType set
    public String tryToFly(){
        if (flyingType != null) {
            return flyingType.fly();
        } else {
            throw new IllegalStateException("Flying type is not set");
        }
    }

    // If you want to be able to change the flyingType dynamically
    // add the following method

    // Method to set the flying ability dynamically
    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }

}