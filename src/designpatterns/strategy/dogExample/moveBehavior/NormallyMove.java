package designpatterns.strategy.dogExample.moveBehavior;

public class NormallyMove implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I move normally");
    }
}
