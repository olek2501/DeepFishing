package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

import static java.lang.Double.parseDouble;
import static java.lang.Math.round;

public class BluBluCommon extends Creature implements Fish  {

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



    public BluBluCommon(){
        this.nickname = "BluBluCommon";
        this.favorite = false;
        rand = new Random();
        this.weight = 1 + (10 - 1) * rand.nextDouble();
        rand = new Random();
        this.length = 1 + (13 - 1) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public BluBluCommon(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 1 + (10 - 1) * rand.nextDouble();
        rand = new Random();
        this.length = 1 + (13 - 1) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public BluBluCommon(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 1 + (10 - 1) * rand.nextDouble();
        rand = new Random();
        this.length = 1 + (13 - 1) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public String toString(){
        return "Blu Blu Common '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: The most common type of fish. Really blue.";
    }
}
