package designpatterns.strategy.dogExample.barkBehavior;

public class Yelp implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("I can yelp");
    }
}
