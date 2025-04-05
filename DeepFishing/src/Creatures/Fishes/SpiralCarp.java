package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class SpiralCarp extends Creature implements Fish  {

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



    public SpiralCarp(){
        this.nickname = "SpiralCarp";
        this.favorite = false;
        rand = new Random();
        this.weight = 3 + (17 - 3) * rand.nextDouble();
        rand = new Random();
        this.length = 3 + (17 - 3) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public SpiralCarp(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 3 + (17 - 3) * rand.nextDouble();
        rand = new Random();
        this.length = 3 + (17 - 3) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public SpiralCarp(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 3 + (17 - 3) * rand.nextDouble();
        rand = new Random();
        this.length = 3 + (17 - 3) * rand.nextDouble();
        this.rarityStatus = 1;
    }

    public String toString(){
        return "Spiral Carp '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Really common type of fish. Really spiral.";
    }
}
