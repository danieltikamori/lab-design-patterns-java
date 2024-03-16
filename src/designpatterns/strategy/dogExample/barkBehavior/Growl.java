package designpatterns.strategy.dogExample.barkBehavior;

public class Growl implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("I can growl");
    }
}
