package designpatterns.strategy.dogExample.barkBehavior;

public class PlayfulBark implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Bark! Bark! Bark!");
    }
}
