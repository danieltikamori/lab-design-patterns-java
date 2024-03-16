package designpatterns.strategy.dogExample;

import designpatterns.strategy.dogExample.barkBehavior.PlayfulBark;
import designpatterns.strategy.dogExample.eatBehavior.CommonDiet;
import designpatterns.strategy.dogExample.moveBehavior.NormallyMove;

public class Labrador extends Dog{

    private String labradorName;
    public Labrador(String labradorName){
        super(labradorName);
        this.labradorName = labradorName;
        eatBehavior = new CommonDiet();
        barkBehavior = new PlayfulBark();
        moveBehavior = new NormallyMove();
    }

    public void display(){
        System.out.println("I am a playful Labrador named " + labradorName);
    }

    public String getLabradorName(){
        return labradorName;
    }
}
