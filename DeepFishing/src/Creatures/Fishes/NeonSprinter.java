package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class NeonSprinter extends Creature implements Fish  {

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
        System.out.println("The fish is sprint swimming around blu blu.");
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



    public NeonSprinter(){
        this.nickname = "NeonSprinter";
        this.favorite = false;
        rand = new Random();
        this.weight = 10 + (23 - 10) * rand.nextDouble();
        rand = new Random();
        this.length = 10 + (19 - 10) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public NeonSprinter(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 10 + (23 - 10) * rand.nextDouble();
        rand = new Random();
        this.length = 10 + (19 - 10) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public NeonSprinter(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 10 + (23 - 10) * rand.nextDouble();
        rand = new Random();
        this.length = 10 + (19 - 10) * rand.nextDouble();
        this.rarityStatus = 3;
    }

    public String toString(){
        return "Neon Sprinter '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Those are pretty rare. They glow with vibrant and saturated colors. They are also really fast.";
    }
}
