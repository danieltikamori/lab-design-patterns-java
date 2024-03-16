package designpatterns.strategy.dogExample;

import designpatterns.strategy.dogExample.barkBehavior.Growl;
import designpatterns.strategy.dogExample.eatBehavior.ProteinDiet;
import designpatterns.strategy.dogExample.moveBehavior.AgressivelyMove;
import designpatterns.strategy.dogExample.moveBehavior.DefensivelyMove;
import designpatterns.strategy.dogExample.moveBehavior.NormallyMove;

public class DogAppMain {
    public static void main(String[] args) {
        Labrador playfulLabrador = new Labrador("Helm");

        Labrador defensiveLabrador = new Labrador("Johnson");

        Poodle friendlyPoodle = new Poodle("Vlissides");

        Dog friendlyPoodle2 = new Poodle("Gamma");

        playfulLabrador.display();
        defensiveLabrador.display();
        friendlyPoodle.display();
        friendlyPoodle2.display();

        System.out.println("The playful Labrador " + playfulLabrador.getLabradorName() + " will start moving: ");
        playfulLabrador.doMove();
        System.out.println("The Playful Labrador" + playfulLabrador.getLabradorName() + " will start moving aggressively: ");
        playfulLabrador.setMoveBehavior(new AgressivelyMove());
        playfulLabrador.doMove();
        System.out.println("The Defensive Labrador " + defensiveLabrador.getLabradorName() + " will start moving defensively: ");
        defensiveLabrador.setMoveBehavior(new DefensivelyMove());
        defensiveLabrador.doMove();

        System.out.println("The poodles will start moving: ");
        friendlyPoodle.doMove();
        System.out.println("The Friendly Poodle " + friendlyPoodle.getPoodleName() + " will start moving aggressively: ");
        friendlyPoodle.setMoveBehavior(new AgressivelyMove());
        friendlyPoodle.doMove();
        System.out.println("The Friendly Poodle will start moving normally: ");
        friendlyPoodle.setMoveBehavior(new NormallyMove());
        friendlyPoodle.doMove();
        friendlyPoodle2.doMove();

        System.out.println("The following will make the dogs bark: ");
        playfulLabrador.doBark();

        defensiveLabrador.setBarkBehavior(new Growl());
        defensiveLabrador.doBark();
        friendlyPoodle.doBark();
        friendlyPoodle2.doBark();

        System.out.println("The following will make the poodles bark growl: ");
        friendlyPoodle.setBarkBehavior(new Growl());
        friendlyPoodle.doBark();
        friendlyPoodle2.setBarkBehavior(new Growl());
        friendlyPoodle2.doBark();

        System.out.println("The following will make the dogs eat: ");
        playfulLabrador.doEat();
        friendlyPoodle.doEat();
        friendlyPoodle2.doEat();

        System.out.println("The following will make the poodles eat protein diet: ");
        friendlyPoodle.setEatBehavior(new ProteinDiet());
        friendlyPoodle.doEat();
        friendlyPoodle2.setEatBehavior(new ProteinDiet());
        friendlyPoodle2.doEat();
    }
}
