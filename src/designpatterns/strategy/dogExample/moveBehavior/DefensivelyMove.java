package designpatterns.strategy.dogExample.moveBehavior;

public class DefensivelyMove implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I move defensively");
    }
}
