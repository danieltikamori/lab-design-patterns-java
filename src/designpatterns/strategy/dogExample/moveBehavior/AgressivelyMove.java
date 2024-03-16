package designpatterns.strategy.dogExample.moveBehavior;

public class AgressivelyMove implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I move aggressively");
    }
}
