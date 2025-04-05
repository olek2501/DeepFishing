package Creatures.Monsters;

import Creatures.Creature;
import Creatures.Monster;

import java.text.DecimalFormat;
import java.util.Random;

public class Shark extends Creature implements Monster {

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
        System.out.println("Your monster trains it's fighting with you.");
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



    public Shark(){
        this.nickname = "Shark";
        boolean favorite = false;
        rand = new Random();
        this.weight = 25 + (70 - 25) * rand.nextDouble();
        rand = new Random();
        this.length = 20 + (35 - 20) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public Shark(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 25 + (70 - 25) * rand.nextDouble();
        rand = new Random();
        this.length = 20 + (35 - 20) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public Shark(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 25 + (70 - 25) * rand.nextDouble();
        rand = new Random();
        this.length = 20 + (35 - 20) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public String toString(){
        return "Shark '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Common monster. Just a scary shark.";
    }
}
