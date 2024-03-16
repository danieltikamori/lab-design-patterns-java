package designpatterns.strategy.dogExample;

import designpatterns.strategy.dogExample.barkBehavior.BarkBehavior;
import designpatterns.strategy.dogExample.eatBehavior.EatBehavior;
import designpatterns.strategy.dogExample.moveBehavior.MoveBehavior;

public abstract class Dog {

    public Dog(String dogName) {
    }

    public abstract void display(); // Abstract method to display the animal. The display() method is made abstract as different dogs have different looks. All the other subclasses will inherit the eat and bark behaviors or override it with their own implementation.

    EatBehavior eatBehavior;
    BarkBehavior barkBehavior;
    MoveBehavior moveBehavior;

    public void doBark(){
        barkBehavior.bark();
    }

    public void doEat(){
        eatBehavior.eat();
    }

    public void doMove(){
        moveBehavior.move();
    }

    public void setEatBehavior(EatBehavior eatBehavior){
        this.eatBehavior = eatBehavior;
    }

    public void setBarkBehavior(BarkBehavior barkBehavior){
        this.barkBehavior = barkBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior){
        this.moveBehavior = moveBehavior;
    }
}
