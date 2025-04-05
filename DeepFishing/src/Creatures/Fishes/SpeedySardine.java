package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class SpeedySardine extends Creature implements Fish  {

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
    public void swim() {
        System.out.println("The fish is speedily swimming around blu blu.");
    }

    @Override
    public void eat() {
        System.out.println("The fish eats. Yum!");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public SpeedySardine(){
        this.nickname = "SpeedySardine";
        this.favorite = false;
        rand = new Random();
        this.weight = 7 + (15 - 7) * rand.nextDouble();
        rand = new Random();
        this.length = 7 + (11 - 7) * rand.nextDouble();
        this.rarityStatus = 7;
    }

    public SpeedySardine(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 7 + (15 - 7) * rand.nextDouble();
        rand = new Random();
        this.length = 7 + (11 - 7) * rand.nextDouble();
        this.rarityStatus = 7;
    }

    public SpeedySardine(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 7 + (15 - 7) * rand.nextDouble();
        rand = new Random();
        this.length = 7 + (11 - 7) * rand.nextDouble();
        this.rarityStatus = 7;
    }

    public String toString(){
        return "Speedy Sardine '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Rarer version of slow sardines. They seem to be related somehow to Neon Sprinters. Pretty fast and vibrant colored.";
    }
}
