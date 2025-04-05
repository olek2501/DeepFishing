package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class Zincish extends Creature implements Fish  {

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
        System.out.println("The fish is swimming around blu blu.");
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



    public Zincish(){
        this.nickname = "Zincish";
        this.favorite = false;
        rand = new Random();
        this.weight = 3 + (10 - 3) * rand.nextDouble();
        rand = new Random();
        this.length = 3 + (10 - 3) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public Zincish(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 3 + (10 - 3) * rand.nextDouble();
        rand = new Random();
        this.length = 3 + (10 - 3) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public Zincish(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 3 + (10 - 3) * rand.nextDouble();
        rand = new Random();
        this.length = 3 + (10 - 3) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public String toString(){
        return "Zincish '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: One of the more rarer fishes. Made entirely out of zinc.";
    }
}
