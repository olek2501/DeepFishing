package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class ExcaliburFish extends Creature implements Fish  {

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
        System.out.println("The fish is swimming around like an excalibur sword blu blu.");
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



    public ExcaliburFish(){
        this.nickname = "ExcaliburFish";
        this.favorite = false;
        rand = new Random();
        this.weight = 80 + (150 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 100 + (200 - 100) * rand.nextDouble();
        this.rarityStatus = 7;
    }

    public ExcaliburFish(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 80 + (150 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 100 + (200 - 100) * rand.nextDouble();
        this.rarityStatus = 7;
    }

    public ExcaliburFish(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 80 + (150 - 80) * rand.nextDouble();
        rand = new Random();
        this.length = 100 + (200 - 100) * rand.nextDouble();
        this.rarityStatus = 7;
    }

    public String toString(){
        return "Excalibur Fish '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Extremely rare fish. It doesn't just look like an excalibur sword, it is one! It's a fish fused with the legendary excalibur sword!!";
    }
}
