package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class BigFish extends Creature implements Fish  {

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
        System.out.println("The fish is swimming around Blu Blu.");
    }

    @Override
    public void eat() {
        System.out.println("The fish eats. Yum! It wants more!");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public BigFish(){
        this.nickname = "BigFish";
        this.favorite = false;
        rand = new Random();
        this.weight = 20 + (55 - 20) * rand.nextDouble();
        rand = new Random();
        this.length = 17 + (33 - 17) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public BigFish(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 20 + (55 - 20) * rand.nextDouble();
        rand = new Random();
        this.length = 17 + (33 - 17) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public BigFish(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 20 + (55 - 20) * rand.nextDouble();
        rand = new Random();
        this.length = 17 + (33 - 17) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public String toString(){
        return "Big Fish '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Pretty rare fish since it's big. It's just really big and always hungry.";
    }
}
