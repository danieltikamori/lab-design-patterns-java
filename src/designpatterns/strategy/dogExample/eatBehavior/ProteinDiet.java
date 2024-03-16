package designpatterns.strategy.dogExample.eatBehavior;

public class ProteinDiet implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("I eat protein");
    }
}
