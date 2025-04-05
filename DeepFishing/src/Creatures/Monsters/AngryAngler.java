package Creatures.Monsters;

import Creatures.Creature;
import Creatures.Monster;

import java.text.DecimalFormat;
import java.util.Random;

public class AngryAngler extends Creature implements Monster {

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
        System.out.println("Your monster trains it's fighting with you. You're careful since it has a lot of sharp teeth.");
    }

    @Override
    public void roar() {
        System.out.println("It roars! Scary..");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public AngryAngler(){
        this.nickname = "Angry Angler";
        boolean favorite = false;
        rand = new Random();
        this.weight = 125 + (150 - 125) * rand.nextDouble();
        rand = new Random();
        this.length = 22 + (30 - 22) * rand.nextDouble();
        this.rarityStatus = 2;
    }

    public AngryAngler(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 125 + (150 - 125) * rand.nextDouble();
        rand = new Random();
        this.length = 22 + (30 - 22) * rand.nextDouble();
        this.rarityStatus = 2;
    }

    public AngryAngler(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 125 + (150 - 125) * rand.nextDouble();
        rand = new Random();
        this.length = 22 + (30 - 22) * rand.nextDouble();
        this.rarityStatus = 2;
    }

    public String toString(){
        return "Angry Angler '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Slightly rarer than a shark. An angry angler monster. Really angry with sharp teeth.";
    }
}
