package Creatures.Monsters;

import Creatures.Creature;
import Creatures.Monster;

import java.text.DecimalFormat;
import java.util.Random;

public class KingOctopus extends Creature implements Monster {

    Random rand = new Random();
    DecimalFormat dcf = new DecimalFormat("#.00");

    // User Input
    String nickname;
    boolean favorite;

    // Game Input
    double weight;
    double length;
    double rarityStatus;

    @Override
    public void fight() {
        System.out.println("Your monster trains it's fighting with you. It's pretty big but you help it better it's splash attacks.");
    }

    @Override
    public void roar() {
        System.out.println("It roars with an unique sound! It seems it uses that noise to communicate with smaller, far away octopi and get their status.");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public KingOctopus(){
        this.nickname = "King Octopus";
        boolean favorite = false;
        rand = new Random();
        this.weight = 80 + (125 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 40 + (90 - 40) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public KingOctopus(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 80 + (125 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 40 + (90 - 40) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public KingOctopus(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 80 + (125 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 40 + (90 - 40) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public String toString(){
        return "King Octopus '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Rare monster. King variant of an octopus. It lives in the deep waters and commands all of it's octopi closer to the surface.";
    }
}
