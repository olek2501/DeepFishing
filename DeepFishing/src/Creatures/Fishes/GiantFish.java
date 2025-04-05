package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class GiantFish extends Creature implements Fish  {

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
        System.out.println("The fish is swimming around BLU BLU.");
    }

    @Override
    public void eat() {
        System.out.println("The fish eats. Yum! It wants EVEN more!");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public GiantFish(){
        this.nickname = "GiantFish";
        this.favorite = false;
        rand = new Random();
        this.weight = 80 + (132 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 28 + (50 - 28) * rand.nextDouble();
        this.rarityStatus = 5;
    }

    public GiantFish(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 80 + (132 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 28 + (50 - 28) * rand.nextDouble();
        this.rarityStatus = 5;
    }

    public GiantFish(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 80 + (132 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 28 + (50 - 28) * rand.nextDouble();
        this.rarityStatus = 5;
    }

    public String toString(){
        return "Giant Fish '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Epic really rare fish. It's enormous and still hungry..";
    }
}
