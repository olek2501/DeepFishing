package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class SwordFish extends Creature implements Fish  {

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
        System.out.println("The fish is swimming around like a sword blu blu.");
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



    public SwordFish(){
        this.nickname = "SwordFish";
        this.favorite = false;
        rand = new Random();
        this.weight = 10 + (20 - 10) * rand.nextDouble();
        rand = new Random();
        this.length = 35 + (70 - 35) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public SwordFish(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 10 + (20 - 10) * rand.nextDouble();
        rand = new Random();
        this.length = 35 + (70 - 35) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public SwordFish(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 10 + (20 - 10) * rand.nextDouble();
        rand = new Random();
        this.length = 35 + (70 - 35) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public String toString(){
        return "Sword Fish '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Pretty rare fish. It doesn't just look like a sword, it is a sword!!";
    }
}
