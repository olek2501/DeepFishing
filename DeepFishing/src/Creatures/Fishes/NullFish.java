package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class NullFish extends Creature implements Fish  {

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



    public NullFish(){
        this.nickname = "null";
        this.favorite = false;
        rand = new Random();
        this.weight = 0 + (1 - 0) * rand.nextDouble();
        rand = new Random();
        this.length = 0 + (1 - 0) * rand.nextDouble();
        this.rarityStatus = 9997;
    }

    public NullFish(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 0 + (1 - 0) * rand.nextDouble();
        rand = new Random();
        this.length = 0 + (1 - 0) * rand.nextDouble();
        this.rarityStatus = 9997;
    }

    public NullFish(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 0 + (1 - 0) * rand.nextDouble();
        rand = new Random();
        this.length = 0 + (1 - 0) * rand.nextDouble();
        this.rarityStatus = 9997;
    }

    public String toString(){
        return "NullFish '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: The most common type of fish. Really blue.";
    }
}
