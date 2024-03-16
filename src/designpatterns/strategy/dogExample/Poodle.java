package designpatterns.strategy.dogExample;

import designpatterns.strategy.dogExample.barkBehavior.Yelp;
import designpatterns.strategy.dogExample.eatBehavior.CommonDiet;
import designpatterns.strategy.dogExample.moveBehavior.DefensivelyMove;

public class Poodle extends Dog {
    private String poodleName;
    public Poodle(String poodleName){
        super(poodleName);
        this.poodleName = poodleName;
        barkBehavior = new Yelp();
        eatBehavior = new CommonDiet();
        moveBehavior = new DefensivelyMove();
    }
    public void display(){
        System.out.println("I am a friendly Poodle named " + poodleName);
    }

    public String getPoodleName() {
        return poodleName;
    }
}
