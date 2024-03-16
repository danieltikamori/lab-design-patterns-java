package designpatterns.strategy.dogExample.eatBehavior;

public class CommonDiet implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("I eat all the food");
    }
}
