package Creatures.Fishes;

import Creatures.Creature;
import Creatures.Fish;

import java.text.DecimalFormat;
import java.util.Random;

public class LegendaryGoldenKoi extends Creature implements Fish  {

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
        System.out.println("The fish is swimming around producing golden pellets around itself blu blu.");
    }

    @Override
    public void eat() {
        System.out.println("The fish eats. It smiles producing golden light from it's body. Yum!");
    }

    @Override
    public double value(){
        double value = (this.weight + this.length) * rarityStatus;
        value = Math.round(value * 100);
        value /= 100;
        return value;
    }



    public LegendaryGoldenKoi(){
        this.nickname = "LegendaryGoldenKoi";
        this.favorite = false;
        rand = new Random();
        this.weight = 375 + (575 - 375) * rand.nextDouble();
        rand = new Random();
        this.length = 175 + (375 - 175) * rand.nextDouble();
        this.rarityStatus = 10;
    }

    public LegendaryGoldenKoi(String nickname){
        this.nickname = nickname;
        this.favorite = false;
        rand = new Random();
        this.weight = 375 + (575 - 375) * rand.nextDouble();
        rand = new Random();
        this.length = 175 + (375 - 175) * rand.nextDouble();
        this.rarityStatus = 10;
    }

    public LegendaryGoldenKoi(String nickname, boolean favorite){
        this.nickname = nickname;
        this.favorite = favorite;
        rand = new Random();
        this.weight = 375 + (575 - 375) * rand.nextDouble();
        rand = new Random();
        this.length = 175 + (375 - 175) * rand.nextDouble();
        this.rarityStatus = 10;
    }

    public String toString(){
        return "Legendary Golden Koi '"+this.nickname+"'"+" valued at "+this.value()+ "\nDESCRIPTION: Legendary fish, the rarest one out there. It's a golden variant of Koi a common surface fish. This variant lives in really deep waters. It is unbelievably rare. It's really valuable since it can produce it's own gold.";
    }
}
