package Creatures.Monsters;

import Creatures.Creature;
import Creatures.Monster;

import java.text.DecimalFormat;
import java.util.Random;

public class Leviathan extends Creature implements Monster {

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
        System.out.println("Your monster trains it's fighting with you. It's extremely big but you can help it train it's speed and roaring water pulses.");
    }

    @Override
    public void roar() {
        System.out.println("It produces a massive powerful roar!!");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public Leviathan(){
        this.nickname = "Leviathan";
        boolean favorite = false;
        rand = new Random();
        this.weight = 225 + (375 - 225) * rand.nextDouble();
        rand = new Random();
        this.length = 65 + (100 - 65) * rand.nextDouble();
        this.rarityStatus = 5;
    }

    public Leviathan(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 225 + (375 - 225) * rand.nextDouble();
        rand = new Random();
        this.length = 65 + (100 - 65) * rand.nextDouble();
        this.rarityStatus = 5;
    }

    public Leviathan(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 225 + (375 - 225) * rand.nextDouble();
        rand = new Random();
        this.length = 65 + (100 - 65) * rand.nextDouble();
        this.rarityStatus = 5;
    }

    public String toString(){
        return "Leviathan '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Super rare monster. Extremely long, eel-shaped sea monster. It can swim fast and roar loudly.";
    }
}
